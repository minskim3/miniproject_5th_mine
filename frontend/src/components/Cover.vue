<template>
    <div>
        <Number
            label="ImageId"
            v-model="value.imageId"
            :editMode="editMode"
        />
        <Number
            label="WritingId"
            v-model="value.writingId"
            :editMode="editMode"
        />
        <Number
            label="AuthorId"
            v-model="value.authorId"
            :editMode="editMode"
        />
        <String
            label="CoverUrl"
            v-model="value.coverUrl"
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
    name: 'Cover',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "covers",
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
