package com.badlogic.gdx.scenes.scene2d.ui;

/* loaded from: classes.dex */
public abstract class Value {
    public static com.badlogic.gdx.scenes.scene2d.ui.Value maxHeight;
    public static com.badlogic.gdx.scenes.scene2d.ui.Value maxWidth;
    public static com.badlogic.gdx.scenes.scene2d.ui.Value minHeight;
    public static com.badlogic.gdx.scenes.scene2d.ui.Value minWidth;
    public static com.badlogic.gdx.scenes.scene2d.ui.Value prefHeight;
    public static com.badlogic.gdx.scenes.scene2d.ui.Value prefWidth;
    public static final com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed zero = null;








    public static class Fixed extends com.badlogic.gdx.scenes.scene2d.ui.Value {
        static final com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed[] cache = null;
        private final float value;

        static {
                r0 = 111(0x6f, float:1.56E-43)
                com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed[] r0 = new com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed[r0]
                com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.cache = r0
                return
        }

        public Fixed(float r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        public static com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed valueOf(float r3) {
                r0 = 0
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 != 0) goto L8
                com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r3 = com.badlogic.gdx.scenes.scene2d.ui.Value.zero
                return r3
            L8:
                r0 = -1054867456(0xffffffffc1200000, float:-10.0)
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 < 0) goto L2a
                r0 = 1120403456(0x42c80000, float:100.0)
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 > 0) goto L2a
                int r0 = (int) r3
                float r1 = (float) r0
                int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r1 != 0) goto L2a
                com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed[] r1 = com.badlogic.gdx.scenes.scene2d.ui.Value.Fixed.cache
                int r0 = r0 + 10
                r2 = r1[r0]
                if (r2 != 0) goto L29
                com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r2 = new com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed
                r2.<init>(r3)
                r1[r0] = r2
            L29:
                return r2
            L2a:
                com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r0 = new com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed
                r0.<init>(r3)
                return r0
        }

        @Override // com.badlogic.gdx.scenes.scene2d.ui.Value
        public float get(com.badlogic.gdx.scenes.scene2d.Actor r1) {
                r0 = this;
                float r1 = r0.value
                return r1
        }

        public java.lang.String toString() {
                r1 = this;
                float r0 = r1.value
                java.lang.String r0 = java.lang.Float.toString(r0)
                return r0
        }
    }

    static {
            com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed r0 = new com.badlogic.gdx.scenes.scene2d.ui.Value$Fixed
            r1 = 0
            r0.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Value.zero = r0
            com.badlogic.gdx.scenes.scene2d.ui.Value$1 r0 = new com.badlogic.gdx.scenes.scene2d.ui.Value$1
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Value.minWidth = r0
            com.badlogic.gdx.scenes.scene2d.ui.Value$2 r0 = new com.badlogic.gdx.scenes.scene2d.ui.Value$2
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Value.minHeight = r0
            com.badlogic.gdx.scenes.scene2d.ui.Value$3 r0 = new com.badlogic.gdx.scenes.scene2d.ui.Value$3
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Value.prefWidth = r0
            com.badlogic.gdx.scenes.scene2d.ui.Value$4 r0 = new com.badlogic.gdx.scenes.scene2d.ui.Value$4
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Value.prefHeight = r0
            com.badlogic.gdx.scenes.scene2d.ui.Value$5 r0 = new com.badlogic.gdx.scenes.scene2d.ui.Value$5
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Value.maxWidth = r0
            com.badlogic.gdx.scenes.scene2d.ui.Value$6 r0 = new com.badlogic.gdx.scenes.scene2d.ui.Value$6
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Value.maxHeight = r0
            return
    }

    public Value() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.Value percentWidth(float r1, com.badlogic.gdx.scenes.scene2d.Actor r2) {
            if (r2 == 0) goto L8
            com.badlogic.gdx.scenes.scene2d.ui.Value$9 r0 = new com.badlogic.gdx.scenes.scene2d.ui.Value$9
            r0.<init>(r2, r1)
            return r0
        L8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "actor cannot be null."
            r1.<init>(r2)
            throw r1
    }

    public abstract float get(com.badlogic.gdx.scenes.scene2d.Actor r1);
}
