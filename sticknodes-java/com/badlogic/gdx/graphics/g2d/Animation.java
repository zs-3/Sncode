package com.badlogic.gdx.graphics.g2d;

/* loaded from: classes.dex */
public class Animation<T> {
    private float animationDuration;
    private float frameDuration;
    T[] keyFrames;
    private int lastFrameNumber;
    private float lastStateTime;
    private com.badlogic.gdx.graphics.g2d.Animation.PlayMode playMode;

    /* renamed from: com.badlogic.gdx.graphics.g2d.Animation$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$badlogic$gdx$graphics$g2d$Animation$PlayMode = null;

        static {
                com.badlogic.gdx.graphics.g2d.Animation$PlayMode[] r0 = com.badlogic.gdx.graphics.g2d.Animation.PlayMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.badlogic.gdx.graphics.g2d.Animation.AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$g2d$Animation$PlayMode = r0
                com.badlogic.gdx.graphics.g2d.Animation$PlayMode r1 = com.badlogic.gdx.graphics.g2d.Animation.PlayMode.NORMAL     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.badlogic.gdx.graphics.g2d.Animation.AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$g2d$Animation$PlayMode     // Catch: java.lang.NoSuchFieldError -> L1d
                com.badlogic.gdx.graphics.g2d.Animation$PlayMode r1 = com.badlogic.gdx.graphics.g2d.Animation.PlayMode.LOOP     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.badlogic.gdx.graphics.g2d.Animation.AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$g2d$Animation$PlayMode     // Catch: java.lang.NoSuchFieldError -> L28
                com.badlogic.gdx.graphics.g2d.Animation$PlayMode r1 = com.badlogic.gdx.graphics.g2d.Animation.PlayMode.LOOP_PINGPONG     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.badlogic.gdx.graphics.g2d.Animation.AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$g2d$Animation$PlayMode     // Catch: java.lang.NoSuchFieldError -> L33
                com.badlogic.gdx.graphics.g2d.Animation$PlayMode r1 = com.badlogic.gdx.graphics.g2d.Animation.PlayMode.LOOP_RANDOM     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.badlogic.gdx.graphics.g2d.Animation.AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$g2d$Animation$PlayMode     // Catch: java.lang.NoSuchFieldError -> L3e
                com.badlogic.gdx.graphics.g2d.Animation$PlayMode r1 = com.badlogic.gdx.graphics.g2d.Animation.PlayMode.REVERSED     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.badlogic.gdx.graphics.g2d.Animation.AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$g2d$Animation$PlayMode     // Catch: java.lang.NoSuchFieldError -> L49
                com.badlogic.gdx.graphics.g2d.Animation$PlayMode r1 = com.badlogic.gdx.graphics.g2d.Animation.PlayMode.LOOP_REVERSED     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                return
        }
    }

    public enum PlayMode extends java.lang.Enum<com.badlogic.gdx.graphics.g2d.Animation.PlayMode> {
        private static final /* synthetic */ com.badlogic.gdx.graphics.g2d.Animation.PlayMode[] $VALUES = null;
        public static final com.badlogic.gdx.graphics.g2d.Animation.PlayMode LOOP = null;
        public static final com.badlogic.gdx.graphics.g2d.Animation.PlayMode LOOP_PINGPONG = null;
        public static final com.badlogic.gdx.graphics.g2d.Animation.PlayMode LOOP_RANDOM = null;
        public static final com.badlogic.gdx.graphics.g2d.Animation.PlayMode LOOP_REVERSED = null;
        public static final com.badlogic.gdx.graphics.g2d.Animation.PlayMode NORMAL = null;
        public static final com.badlogic.gdx.graphics.g2d.Animation.PlayMode REVERSED = null;

        static {
                com.badlogic.gdx.graphics.g2d.Animation$PlayMode r0 = new com.badlogic.gdx.graphics.g2d.Animation$PlayMode
                java.lang.String r1 = "NORMAL"
                r2 = 0
                r0.<init>(r1, r2)
                com.badlogic.gdx.graphics.g2d.Animation.PlayMode.NORMAL = r0
                com.badlogic.gdx.graphics.g2d.Animation$PlayMode r1 = new com.badlogic.gdx.graphics.g2d.Animation$PlayMode
                java.lang.String r3 = "REVERSED"
                r4 = 1
                r1.<init>(r3, r4)
                com.badlogic.gdx.graphics.g2d.Animation.PlayMode.REVERSED = r1
                com.badlogic.gdx.graphics.g2d.Animation$PlayMode r3 = new com.badlogic.gdx.graphics.g2d.Animation$PlayMode
                java.lang.String r5 = "LOOP"
                r6 = 2
                r3.<init>(r5, r6)
                com.badlogic.gdx.graphics.g2d.Animation.PlayMode.LOOP = r3
                com.badlogic.gdx.graphics.g2d.Animation$PlayMode r5 = new com.badlogic.gdx.graphics.g2d.Animation$PlayMode
                java.lang.String r7 = "LOOP_REVERSED"
                r8 = 3
                r5.<init>(r7, r8)
                com.badlogic.gdx.graphics.g2d.Animation.PlayMode.LOOP_REVERSED = r5
                com.badlogic.gdx.graphics.g2d.Animation$PlayMode r7 = new com.badlogic.gdx.graphics.g2d.Animation$PlayMode
                java.lang.String r9 = "LOOP_PINGPONG"
                r10 = 4
                r7.<init>(r9, r10)
                com.badlogic.gdx.graphics.g2d.Animation.PlayMode.LOOP_PINGPONG = r7
                com.badlogic.gdx.graphics.g2d.Animation$PlayMode r9 = new com.badlogic.gdx.graphics.g2d.Animation$PlayMode
                java.lang.String r11 = "LOOP_RANDOM"
                r12 = 5
                r9.<init>(r11, r12)
                com.badlogic.gdx.graphics.g2d.Animation.PlayMode.LOOP_RANDOM = r9
                r11 = 6
                com.badlogic.gdx.graphics.g2d.Animation$PlayMode[] r11 = new com.badlogic.gdx.graphics.g2d.Animation.PlayMode[r11]
                r11[r2] = r0
                r11[r4] = r1
                r11[r6] = r3
                r11[r8] = r5
                r11[r10] = r7
                r11[r12] = r9
                com.badlogic.gdx.graphics.g2d.Animation.PlayMode.$VALUES = r11
                return
        }

        PlayMode(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.badlogic.gdx.graphics.g2d.Animation.PlayMode valueOf(java.lang.String r1) {
                java.lang.Class<com.badlogic.gdx.graphics.g2d.Animation$PlayMode> r0 = com.badlogic.gdx.graphics.g2d.Animation.PlayMode.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.badlogic.gdx.graphics.g2d.Animation$PlayMode r1 = (com.badlogic.gdx.graphics.g2d.Animation.PlayMode) r1
                return r1
        }

        public static com.badlogic.gdx.graphics.g2d.Animation.PlayMode[] values() {
                com.badlogic.gdx.graphics.g2d.Animation$PlayMode[] r0 = com.badlogic.gdx.graphics.g2d.Animation.PlayMode.$VALUES
                java.lang.Object r0 = r0.clone()
                com.badlogic.gdx.graphics.g2d.Animation$PlayMode[] r0 = (com.badlogic.gdx.graphics.g2d.Animation.PlayMode[]) r0
                return r0
        }
    }

    public Animation(float r4, com.badlogic.gdx.utils.Array<? extends T> r5) {
            r3 = this;
            r3.<init>()
            com.badlogic.gdx.graphics.g2d.Animation$PlayMode r0 = com.badlogic.gdx.graphics.g2d.Animation.PlayMode.NORMAL
            r3.playMode = r0
            r3.frameDuration = r4
            T[] r4 = r5.items
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r4 = r4.getComponentType()
            int r0 = r5.size
            java.lang.Object r4 = com.badlogic.gdx.utils.reflect.ArrayReflection.newInstance(r4, r0)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r0 = r5.size
            r1 = 0
        L1e:
            if (r1 >= r0) goto L29
            java.lang.Object r2 = r5.get(r1)
            r4[r1] = r2
            int r1 = r1 + 1
            goto L1e
        L29:
            r3.setKeyFrames(r4)
            return
    }

    public Animation(float r1, com.badlogic.gdx.utils.Array<? extends T> r2, com.badlogic.gdx.graphics.g2d.Animation.PlayMode r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.setPlayMode(r3)
            return
    }

    public float getAnimationDuration() {
            r1 = this;
            float r0 = r1.animationDuration
            return r0
    }

    public T getKeyFrame(float r2) {
            r1 = this;
            int r2 = r1.getKeyFrameIndex(r2)
            T[] r0 = r1.keyFrames
            r2 = r0[r2]
            return r2
    }

    public int getKeyFrameIndex(float r6) {
            r5 = this;
            T[] r0 = r5.keyFrames
            int r0 = r0.length
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L8
            return r1
        L8:
            float r0 = r5.frameDuration
            float r0 = r6 / r0
            int r0 = (int) r0
            int[] r3 = com.badlogic.gdx.graphics.g2d.Animation.AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$g2d$Animation$PlayMode
            com.badlogic.gdx.graphics.g2d.Animation$PlayMode r4 = r5.playMode
            int r4 = r4.ordinal()
            r3 = r3[r4]
            switch(r3) {
                case 1: goto L5a;
                case 2: goto L55;
                case 3: goto L42;
                case 4: goto L2e;
                case 5: goto L24;
                case 6: goto L1b;
                default: goto L1a;
            }
        L1a:
            goto L62
        L1b:
            T[] r1 = r5.keyFrames
            int r3 = r1.length
            int r0 = r0 % r3
            int r1 = r1.length
            int r1 = r1 - r0
            int r0 = r1 + (-1)
            goto L62
        L24:
            T[] r3 = r5.keyFrames
            int r3 = r3.length
            int r3 = r3 - r0
            int r3 = r3 - r2
            int r0 = java.lang.Math.max(r3, r1)
            goto L62
        L2e:
            float r1 = r5.lastStateTime
            float r3 = r5.frameDuration
            float r1 = r1 / r3
            int r1 = (int) r1
            if (r1 == r0) goto L3f
            T[] r0 = r5.keyFrames
            int r0 = r0.length
            int r0 = r0 - r2
            int r0 = com.badlogic.gdx.math.MathUtils.random(r0)
            goto L62
        L3f:
            int r0 = r5.lastFrameNumber
            goto L62
        L42:
            T[] r1 = r5.keyFrames
            int r2 = r1.length
            int r2 = r2 * 2
            int r2 = r2 + (-2)
            int r0 = r0 % r2
            int r2 = r1.length
            if (r0 < r2) goto L62
            int r2 = r1.length
            int r2 = r2 + (-2)
            int r1 = r1.length
            int r0 = r0 - r1
            int r0 = r2 - r0
            goto L62
        L55:
            T[] r1 = r5.keyFrames
            int r1 = r1.length
            int r0 = r0 % r1
            goto L62
        L5a:
            T[] r1 = r5.keyFrames
            int r1 = r1.length
            int r1 = r1 - r2
            int r0 = java.lang.Math.min(r1, r0)
        L62:
            r5.lastFrameNumber = r0
            r5.lastStateTime = r6
            return r0
    }

    public T[] getKeyFrames() {
            r1 = this;
            T[] r0 = r1.keyFrames
            return r0
    }

    public boolean isAnimationFinished(float r3) {
            r2 = this;
            float r0 = r2.frameDuration
            float r3 = r3 / r0
            int r3 = (int) r3
            T[] r0 = r2.keyFrames
            int r0 = r0.length
            r1 = 1
            int r0 = r0 - r1
            if (r0 >= r3) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    public void setFrameDuration(float r2) {
            r1 = this;
            r1.frameDuration = r2
            T[] r0 = r1.keyFrames
            int r0 = r0.length
            float r0 = (float) r0
            float r0 = r0 * r2
            r1.animationDuration = r0
            return
    }

    protected void setKeyFrames(T... r2) {
            r1 = this;
            r1.keyFrames = r2
            int r2 = r2.length
            float r2 = (float) r2
            float r0 = r1.frameDuration
            float r2 = r2 * r0
            r1.animationDuration = r2
            return
    }

    public void setPlayMode(com.badlogic.gdx.graphics.g2d.Animation.PlayMode r1) {
            r0 = this;
            r0.playMode = r1
            return
    }
}
