<template>
    <a-layout>


            <a-layout-sider width="200" style="background: #fff">
                <a-menu
                        mode="inline"
                        v-model:selectedKeys="selectedKeys2"
                        v-model:openKeys="openKeys"
                        :style="{ height: '100%', borderRight: 0 }"
                >
                    <a-sub-menu key="sub1">
                        <template #title>
              <span>
                <user-outlined />
                subnav 1
              </span>
                        </template>
                        <a-menu-item key="1">option1</a-menu-item>
                        <a-menu-item key="2">option2</a-menu-item>
                        <a-menu-item key="3">option3</a-menu-item>
                        <a-menu-item key="4">option4</a-menu-item>
                    </a-sub-menu>
                    <a-sub-menu key="sub2">
                        <template #title>
              <span>
                <laptop-outlined />
                subnav 2
              </span>
                        </template>
                        <a-menu-item key="5">option5</a-menu-item>
                        <a-menu-item key="6">option6</a-menu-item>
                        <a-menu-item key="7">option7</a-menu-item>
                        <a-menu-item key="8">option8</a-menu-item>
                    </a-sub-menu>
                    <a-sub-menu key="sub3">
                        <template #title>
              <span>
                <notification-outlined />
                subnav 3
              </span>
                        </template>
                        <a-menu-item key="9">option9</a-menu-item>
                        <a-menu-item key="10">option10</a-menu-item>
                        <a-menu-item key="11">option11</a-menu-item>
                        <a-menu-item key="12">option12</a-menu-item>
                    </a-sub-menu>
                </a-menu>
            </a-layout-sider>

            <a-layout-content
                    :style="{ background: '#fff', padding: '24px', margin: 0, minHeight: '280px' }"
            >
                <a-list item-layout="vertical" size="large" :grid="{ gutter: 20, column: 3 }"
                       :data-source="ebooks">

                    <template #renderItem="{ item }">

                        <a-list-item key="item.name">

                            <template #actions>
          <span v-for="{ type, text } in actions" :key="type">
            <component v-bind:is="type" style="margin-right: 8px" />
            {{ text }}
          </span>
                            </template>

                            <a-list-item-meta :description="item.description">
                                <template #title>
                                    <a :href="item.href">{{ item.name }}</a>
                                </template>
                                <template #avatar><a-avatar :src="item.cover" /></template>
                            </a-list-item-meta>

                        </a-list-item>
                    </template>
                </a-list>
            </a-layout-content>

    </a-layout>

</template>


<script lang="ts">
import { defineComponent,onMounted,ref,reactive,toRef } from 'vue';
import axios from 'axios'
import { StarOutlined, LikeOutlined, MessageOutlined } from '@ant-design/icons-vue';


// const listData: Record<string, string>[] = [];
//
// for (let i = 0; i < 23; i++) {
//     listData.push({
//         href: 'https://www.antdv.com/',
//         title: `ant design vue part ${i}`,
//         avatar: 'https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png',
//         description:
//             'Ant Design, a design language for background applications, is refined by Ant UED Team.',
//         content:
//             'We supply a series of design principles, practical patterns and high quality design resources (Sketch and Axure), to help people create their product prototypes beautifully and efficiently.',
//     });
// }

export default defineComponent({
  name: 'Home',
    components: {
        StarOutlined,
        LikeOutlined,
        MessageOutlined,
    },
    setup() {
        const pagination = {
            onChange: (page: number) => {
                console.log(page);
            },
            pageSize: 3,
        };
        const actions: Record<string, string>[] = [
            { type: 'StarOutlined', text: '156' },
            { type: 'LikeOutlined', text: '156' },
            { type: 'MessageOutlined', text: '2' },
        ];
        console.log("setup");
        const ebooks = ref();
        const ebooks1 = reactive({books:[]});
        onMounted(()=>{
            console.log("onMounted");
            axios.get("/ebook/list", {
                params: {
                    page: 1,
                    size: 1000
                }
            }).then(function (response) {
                // 把响应里的data拿出来
                const data = response.data;
                ebooks.value = data.content.list;//content是电子书列表
                // ebooks1.books = data.content;
                console.log(response);
            });

        });

        return{
            ebooks,
            // ebooks2: toRef(ebooks1,"books"),
            pagination,
            actions,
        };
    }

});
</script>

<style scoped>
    .ant-avatar {
        width: 50px;
        height: 50px;
        line-height: 50px;
        border-radius: 8%;
        margin: 5px 0;
    }
</style>
