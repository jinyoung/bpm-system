<template>
    <div>
        <UUID offline label="채팅방 ID" v-model="value.chatroomId" :editMode="editMode" @change="change"/>

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
import UUID from './UUID.vue'

export default {
    name: 'Chatroom',
    mixins:[BaseEntity],
    components:{
        UUID,
    },
    
    data: () => ({
        path: "chatrooms"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
