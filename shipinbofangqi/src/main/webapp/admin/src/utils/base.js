const base = {
    get() {
        return {
            url : "http://localhost:8080/shipinbofangqi/",
            name: "shipinbofangqi",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/shipinbofangqi/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "视频播放器"
        } 
    }
}
export default base
