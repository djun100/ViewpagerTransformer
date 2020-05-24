package leifu.viewpagertransfomerlibrary.transformer;

import android.view.View;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:15/6/19 上午8:41
 * 描述:
 */
public class ParallaxPageTransformer extends BasePageTransformer {

    public ParallaxPageTransformer() {
    }

    @Override
    public void handleInvisiblePage(View view, float position) {
    }

    @Override
    public void handleLeftPage(View view, float position) {
        view.setTranslationX(-view.getWidth() * position);
    }

    @Override
    public void handleRightPage(View view, float position) {
        view.setTranslationX(0);
    }

}