import { createRouter, createWebHashHistory } from 'vue-router';

const router = createRouter({
  history: createWebHashHistory(),
  routes: [
    {
      path: '/',
      component: () => import('../components/pages/Index.vue'),
    },
    {
      path: '/authors',
      component: () => import('../components/ui/AuthorGrid.vue'),
    },
    {
      path: '/writings',
      component: () => import('../components/ui/WritingGrid.vue'),
    },
    {
      path: '/authorStatuses',
      component: () => import('../components/AuthorStatusView.vue'),
    },
    {
      path: '/covers',
      component: () => import('../components/ui/CoverGrid.vue'),
    },
    {
      path: '/summaries',
      component: () => import('../components/ui/SummaryGrid.vue'),
    },
    {
      path: '/points',
      component: () => import('../components/ui/PointGrid.vue'),
    },
    {
      path: '/libraryInfos',
      component: () => import('../components/ui/LibraryInfoGrid.vue'),
    },
    {
      path: '/subscribers',
      component: () => import('../components/ui/SubscriberGrid.vue'),
    },
    {
      path: '/subscribedBooks',
      component: () => import('../components/ui/SubscribedBookGrid.vue'),
    },
    {
      path: '/subscribeLists',
      component: () => import('../components/SubscribeListView.vue'),
    },
  ],
})

export default router;
