<template>
    <div>
        <Number
            label="SummaryId"
            v-model="value.summaryId"
            :editMode="editMode"
        />
        <String
            label="WritingId"
            v-model="value.writingId"
            :editMode="editMode"
        />
        <String
            label="SummaryContext"
            v-model="value.summaryContext"
            :editMode="editMode"
        />
        <String
            label="Tag"
            v-model="value.tag"
            :editMode="editMode"
        />
        <Date
            label="CreatedAt"
            v-model="value.createdAt"
            :editMode="editMode"
        />
        <v-row class="ma-0 pa-0">
            <v-spacer></v-spacer>
            <v-btn width="64px" color="primary" @click="save">
                저장
            </v-btn>
        </v-row>
    </div>
</template>


<script>
import BaseEntity from './base-ui/BaseEntity.vue'

export default {
    name: 'Summary',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "summaries",
        value: {
        }
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
