import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
// apache commons-loggingを使用
public class Main {
	public static void main(String[] args) {
		// ログは、プログラム動作中にファイルに書き出される動作記録のことであり、
		// プログラムの動作状況や障害要因を把握するための貴重な情報源である
		// ログの出力は一般的になんらかのライブラリを使う
		// ライブラリによって細かな利用方法や設定は異なるがいずれも
		// メソッドを呼び出せば、文字列をログファイルなどに出力できる
		// ログ出力時に重要度を指定できる、といった基本機能を備えている
		// 重要度の度合いはライブラリによって違うが通常5~8段階程度
		Log logger = LogFactory.getLog(Main.class);
		if(args.length != 2) {
			logger.error("起動引数の数が異常:"+ args.length);
		}
	}
}
