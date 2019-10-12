module.exports = {
	"transpileDependencies" : [ "vuetify" ],
	/*
	 * changeOrigin: true
	 * CORS(オリジンが違うことによるエラー)の防止
	 * backend 側で @RestController アノテーションを付与したクラスに@CrossOrigin アノテーションを付与して設定しなくてもアクセスできるように
	 */
	devServer : {
		proxy : {
			"^/webapi/sample" : {
				target : "http://localhost:8081",
				changeOrigin : true
			}
		}
	}
}