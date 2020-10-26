package com.lilosoft.virtualrobot.utils;

import com.lilosoft.virtualrobot.entity.Action;
import com.lilosoft.virtualrobot.entity.Coordinate;
import com.lilosoft.virtualrobot.entity.Effect;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luteng on 2020/1/8 17:47
 */
public abstract class EffectFactory {
    private static ArrayList<Effect> effectList;

    private static void initAvatarPTAs() {
        effectList = new ArrayList<>();
    }

    public static void setEffectList(List<Effect> effects) {
        if (!checkValid())
            initAvatarPTAs();

        effectList.clear();
        effectList.addAll(effects);
    }

    public static ArrayList<Effect> getEffectList() {
        return effectList;
    }

    private static boolean checkValid() {
        return effectList != null;
    }

    /**
     * 获取当前形象坐标
     */
    public static double[] getEffectCoordinate(boolean isHalf, String effectID) {
        double[] coordinateXYZ = null;
        for (Effect effect : getEffectList()) {
            if (effect.getEffectID().equalsIgnoreCase(effectID)) {
                Coordinate coordinate = isHalf ? effect.getCoordinateHalf() : effect.getCoordinate();
                coordinateXYZ = new double[]{coordinate.getFixX(), coordinate.getFixY(), coordinate.getFixZ()};
                break;
            }
        }
        return coordinateXYZ;
    }

    /**
     * 获取当前形象动作
     */
    public static ArrayList<Action> animationActionListWithEffectName(String effectID) {
        ArrayList<Action> actions = new ArrayList<>();
        for (Effect effect : getEffectList()) {
            if (effect.getEffectID().equalsIgnoreCase(effectID)) {
                actions.addAll(effect.getAnimPath());
                break;
            }
        }
        return actions;
    }
}
