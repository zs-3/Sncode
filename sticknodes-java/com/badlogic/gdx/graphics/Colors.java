package com.badlogic.gdx.graphics;

/* loaded from: classes.dex */
public final class Colors {
    private static final com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.graphics.Color> map = null;

    static {
            com.badlogic.gdx.utils.ObjectMap r0 = new com.badlogic.gdx.utils.ObjectMap
            r0.<init>()
            com.badlogic.gdx.graphics.Colors.map = r0
            reset()
            return
    }

    public static com.badlogic.gdx.graphics.Color get(java.lang.String r1) {
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.graphics.Color> r0 = com.badlogic.gdx.graphics.Colors.map
            java.lang.Object r1 = r0.get(r1)
            com.badlogic.gdx.graphics.Color r1 = (com.badlogic.gdx.graphics.Color) r1
            return r1
    }

    public static void reset() {
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, com.badlogic.gdx.graphics.Color> r0 = com.badlogic.gdx.graphics.Colors.map
            r0.clear()
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.CLEAR
            java.lang.String r2 = "CLEAR"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.BLACK
            java.lang.String r2 = "BLACK"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.WHITE
            java.lang.String r2 = "WHITE"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.LIGHT_GRAY
            java.lang.String r2 = "LIGHT_GRAY"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.GRAY
            java.lang.String r2 = "GRAY"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.DARK_GRAY
            java.lang.String r2 = "DARK_GRAY"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.BLUE
            java.lang.String r2 = "BLUE"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.NAVY
            java.lang.String r2 = "NAVY"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.ROYAL
            java.lang.String r2 = "ROYAL"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.SLATE
            java.lang.String r2 = "SLATE"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.SKY
            java.lang.String r2 = "SKY"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.CYAN
            java.lang.String r2 = "CYAN"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.TEAL
            java.lang.String r2 = "TEAL"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.GREEN
            java.lang.String r2 = "GREEN"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.CHARTREUSE
            java.lang.String r2 = "CHARTREUSE"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.LIME
            java.lang.String r2 = "LIME"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.FOREST
            java.lang.String r2 = "FOREST"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.OLIVE
            java.lang.String r2 = "OLIVE"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.YELLOW
            java.lang.String r2 = "YELLOW"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.GOLD
            java.lang.String r2 = "GOLD"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.GOLDENROD
            java.lang.String r2 = "GOLDENROD"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.ORANGE
            java.lang.String r2 = "ORANGE"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.BROWN
            java.lang.String r2 = "BROWN"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.TAN
            java.lang.String r2 = "TAN"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.FIREBRICK
            java.lang.String r2 = "FIREBRICK"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.RED
            java.lang.String r2 = "RED"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.SCARLET
            java.lang.String r2 = "SCARLET"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.CORAL
            java.lang.String r2 = "CORAL"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.SALMON
            java.lang.String r2 = "SALMON"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.PINK
            java.lang.String r2 = "PINK"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.MAGENTA
            java.lang.String r2 = "MAGENTA"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.PURPLE
            java.lang.String r2 = "PURPLE"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.VIOLET
            java.lang.String r2 = "VIOLET"
            r0.put(r2, r1)
            com.badlogic.gdx.graphics.Color r1 = com.badlogic.gdx.graphics.Color.MAROON
            java.lang.String r2 = "MAROON"
            r0.put(r2, r1)
            return
    }
}
