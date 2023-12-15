<template>
    <div>
        <String label="태스크명" v-model="value.taskName" :editMode="editMode"/>
        <String label="상태" v-model="value.status" :editMode="editMode"/>
        <UUID offline label="태스크 ID" v-model="value.taskId" :editMode="editMode" @change="change"/>
        <UUID offline label="사용자 ID" v-model="value.userId" :editMode="editMode" @change="change"/>

        <v-divider class="border-opacity-100 my-divider"></v-divider>
        <v-layout row justify-end>
            <v-btn
                width="64px"
                color="primary"
                @click="save"
            >
                저장
            </v-btn>
        </v-layout>
    </div>
</template>


<script>

import BaseEntity from './base-ui/BaseEntity.vue'
import String from './primitives/String.vue'
import UUID from './UUID.vue'
import UUID from './UUID.vue'

export default {
    name: 'TaskList',
    mixins:[BaseEntity],
    components:{
        String,
        UUID,
        UUID,
    },
    
    data: () => ({
        path: "taskLists"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
