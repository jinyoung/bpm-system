<template>
    <div>
        <String label="프로세스명" v-model="value.processName" :editMode="editMode"/>
        <UUID offline label="프로세스 ID" v-model="value.processId" :editMode="editMode" @change="change"/>

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

export default {
    name: 'Process',
    mixins:[BaseEntity],
    components:{
        String,
        UUID,
    },
    
    data: () => ({
        path: "processes"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
