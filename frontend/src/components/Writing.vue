<template>
    <div>
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
            label="Title"
            v-model="value.title"
            :editMode="editMode"
        />
        <String
            label="PenName"
            v-model="value.penName"
            :editMode="editMode"
        />
        <String
            label="Context"
            v-model="value.context"
            :editMode="editMode"
        />
        <Date
            label="RegistDate"
            v-model="value.registDate"
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
    name: 'Writing',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "writings",
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
