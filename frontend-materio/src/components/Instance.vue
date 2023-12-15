<template>
    <div>
        <String label="상태" v-model="value.status" :editMode="editMode"/>
        <UUID offline label="인스턴스 ID" v-model="value.instanceId" :editMode="editMode" @change="change"/>
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
import UUID from './UUID.vue'

export default {
    name: 'Instance',
    mixins:[BaseEntity],
    components:{
        String,
        UUID,
        UUID,
    },
    
    data: () => ({
        path: "instances"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
