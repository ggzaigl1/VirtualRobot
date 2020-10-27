package com.lilosoft.virtualrobot.utils;

import com.faceunity.entity.FUEffect;
import com.faceunity.fuenum.FUEffectType;
import com.lilosoft.virtualrobot.Constant;
import com.lilosoft.virtualrobot.entity.Action;
import com.lilosoft.virtualrobot.entity.Coordinate;
import com.lilosoft.virtualrobot.entity.Effect;

import java.util.List;


public final class SwitchUtils {

    /**
     * 自定义形象转为SDK形象
     *
     * @param effect 形象
     */
    public static FUEffect convertEffect(Effect effect) {
        if (effect != null) {
            effect.setBackgroundPath("");
            List<String> paths = effect.getBundlePath();
            String[] pathArr = new String[]{};
            if (paths != null && paths.size() > 0) {
                pathArr = new String[paths.size()];
                for (int i = 0; i < paths.size(); i++) {
                    pathArr[i] = paths.get(i);
                }
            }
            List<Action> action = effect.getDefaultAnimPath();
            String[] actionArr = new String[]{};
            if (action != null && action.size() > 0) {
                actionArr = new String[action.size()];
                for (int i = 0; i < action.size(); i++) {
                    actionArr[i] = action.get(i).getPath();
                }
            }
            if (Constant.sShowMode == Constant.SHOW_MODE_HALF) {
                Coordinate coordinate = effect.getCoordinateHalf();
                return new FUEffect(effect.getEffectID(), pathArr, actionArr, effect.getBsConfigPath(), effect.getLightPath(), effect.getBackgroundPath(), new double[]{coordinate.getFixX(), coordinate.getFixY(), coordinate.getFixZ()}, effect.getEmotionCode() > 0 ? FUEffectType.CARTOON : FUEffectType.REAL, effect.getTagAlignConfig());
            } else {
                Coordinate coordinate = effect.getCoordinate();
                return new FUEffect(effect.getEffectID(), pathArr, actionArr, effect.getBsConfigPath(), effect.getLightPath(), effect.getBackgroundPath(), new double[]{-10, 40, -650}, effect.getEmotionCode() > 0 ? FUEffectType.CARTOON : FUEffectType.REAL, effect.getTagAlignConfig());
            }
        }
        return null;
    }

}
