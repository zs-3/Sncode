package com.badlogic.gdx.graphics.g2d;

/* loaded from: classes.dex */
public class ParticleEmitter {
    private boolean[] active;
    private int activeCount;
    private boolean additive;
    private boolean aligned;
    private com.badlogic.gdx.graphics.g2d.ParticleEmitter.ScaledNumericValue angleValue;
    private boolean attached;
    private boolean behind;
    boolean cleansUpBlendFunction;
    private boolean continuous;
    private com.badlogic.gdx.graphics.g2d.ParticleEmitter.RangedNumericValue delayValue;
    public float duration;
    private com.badlogic.gdx.graphics.g2d.ParticleEmitter.RangedNumericValue durationValue;
    private com.badlogic.gdx.graphics.g2d.ParticleEmitter.ScaledNumericValue emissionValue;
    private com.badlogic.gdx.graphics.g2d.ParticleEmitter.ScaledNumericValue gravityValue;
    private com.badlogic.gdx.utils.Array<java.lang.String> imagePaths;
    private com.badlogic.gdx.graphics.g2d.ParticleEmitter.IndependentScaledNumericValue lifeOffsetValue;
    private com.badlogic.gdx.graphics.g2d.ParticleEmitter.IndependentScaledNumericValue lifeValue;
    private int maxParticleCount;
    private int minParticleCount;
    private java.lang.String name;
    private com.badlogic.gdx.graphics.g2d.ParticleEmitter.Particle[] particles;
    private boolean premultipliedAlpha;
    private com.badlogic.gdx.graphics.g2d.ParticleEmitter.ScaledNumericValue rotationValue;
    private com.badlogic.gdx.graphics.g2d.ParticleEmitter.ScaledNumericValue spawnHeightValue;
    private com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnShapeValue spawnShapeValue;
    private com.badlogic.gdx.graphics.g2d.ParticleEmitter.ScaledNumericValue spawnWidthValue;
    private com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpriteMode spriteMode;
    private com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.Sprite> sprites;
    private com.badlogic.gdx.graphics.g2d.ParticleEmitter.GradientColorValue tintValue;
    private com.badlogic.gdx.graphics.g2d.ParticleEmitter.ScaledNumericValue transparencyValue;
    private com.badlogic.gdx.graphics.g2d.ParticleEmitter.ScaledNumericValue velocityValue;
    private com.badlogic.gdx.graphics.g2d.ParticleEmitter.ScaledNumericValue windValue;
    private com.badlogic.gdx.graphics.g2d.ParticleEmitter.RangedNumericValue xOffsetValue;
    private com.badlogic.gdx.graphics.g2d.ParticleEmitter.ScaledNumericValue xScaleValue;
    private com.badlogic.gdx.graphics.g2d.ParticleEmitter.RangedNumericValue yOffsetValue;
    private com.badlogic.gdx.graphics.g2d.ParticleEmitter.ScaledNumericValue yScaleValue;

    public static class GradientColorValue extends com.badlogic.gdx.graphics.g2d.ParticleEmitter.ParticleValue {
        private static float[] temp;
        private float[] colors;
        float[] timeline;

        static {
                r0 = 4
                float[] r0 = new float[r0]
                com.badlogic.gdx.graphics.g2d.ParticleEmitter.GradientColorValue.temp = r0
                return
        }

        public GradientColorValue() {
                r4 = this;
                r4.<init>()
                r0 = 3
                float[] r0 = new float[r0]
                r0 = {x0018: FILL_ARRAY_DATA , data: [1065353216, 1065353216, 1065353216} // fill-array
                r4.colors = r0
                r0 = 1
                float[] r1 = new float[r0]
                r2 = 0
                r3 = 0
                r1[r2] = r3
                r4.timeline = r1
                r4.alwaysActive = r0
                return
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.ParticleValue
        public void load(java.io.BufferedReader r6) throws java.io.IOException {
                r5 = this;
                super.load(r6)
                boolean r0 = r5.active
                if (r0 != 0) goto L8
                return
            L8:
                java.lang.String r0 = "colorsCount"
                int r0 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.readInt(r6, r0)
                float[] r0 = new float[r0]
                r5.colors = r0
                r0 = 0
                r1 = 0
            L14:
                float[] r2 = r5.colors
                int r3 = r2.length
                if (r1 >= r3) goto L33
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "colors"
                r3.append(r4)
                r3.append(r1)
                java.lang.String r3 = r3.toString()
                float r3 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.readFloat(r6, r3)
                r2[r1] = r3
                int r1 = r1 + 1
                goto L14
            L33:
                java.lang.String r1 = "timelineCount"
                int r1 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.readInt(r6, r1)
                float[] r1 = new float[r1]
                r5.timeline = r1
            L3d:
                float[] r1 = r5.timeline
                int r2 = r1.length
                if (r0 >= r2) goto L5c
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "timeline"
                r2.append(r3)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                float r2 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.readFloat(r6, r2)
                r1[r0] = r2
                int r0 = r0 + 1
                goto L3d
            L5c:
                return
        }
    }

    public static class IndependentScaledNumericValue extends com.badlogic.gdx.graphics.g2d.ParticleEmitter.ScaledNumericValue {
        boolean independent;

        public IndependentScaledNumericValue() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.ScaledNumericValue, com.badlogic.gdx.graphics.g2d.ParticleEmitter.RangedNumericValue, com.badlogic.gdx.graphics.g2d.ParticleEmitter.ParticleValue
        public void load(java.io.BufferedReader r3) throws java.io.IOException {
                r2 = this;
                super.load(r3)
                boolean r0 = r3.markSupported()
                if (r0 == 0) goto Le
                r0 = 100
                r3.mark(r0)
            Le:
                java.lang.String r0 = r3.readLine()
                if (r0 == 0) goto L40
                java.lang.String r1 = "independent"
                boolean r1 = r0.contains(r1)
                if (r1 == 0) goto L27
                java.lang.String r3 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.readString(r0)
                boolean r3 = java.lang.Boolean.parseBoolean(r3)
                r2.independent = r3
                goto L30
            L27:
                boolean r0 = r3.markSupported()
                if (r0 == 0) goto L31
                r3.reset()
            L30:
                return
            L31:
                java.lang.String r3 = "The loaded particle effect descriptor file uses an old invalid format. Please download the latest version of the Particle Editor tool and recreate the file by loading and saving it again."
                com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
                java.lang.String r1 = "ParticleEmitter"
                r0.error(r1, r3)
                java.io.IOException r0 = new java.io.IOException
                r0.<init>(r3)
                throw r0
            L40:
                java.io.IOException r3 = new java.io.IOException
                java.lang.String r0 = "Missing value: independent"
                r3.<init>(r0)
                throw r3
        }
    }

    public static class Particle extends com.badlogic.gdx.graphics.g2d.Sprite {
    }

    public static class ParticleValue {
        boolean active;
        boolean alwaysActive;

        public ParticleValue() {
                r0 = this;
                r0.<init>()
                return
        }

        public void load(java.io.BufferedReader r2) throws java.io.IOException {
                r1 = this;
                boolean r0 = r1.alwaysActive
                if (r0 != 0) goto Ld
                java.lang.String r0 = "active"
                boolean r2 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.readBoolean(r2, r0)
                r1.active = r2
                goto L10
            Ld:
                r2 = 1
                r1.active = r2
            L10:
                return
        }

        public void setActive(boolean r1) {
                r0 = this;
                r0.active = r1
                return
        }

        public void setAlwaysActive(boolean r1) {
                r0 = this;
                r0.alwaysActive = r1
                return
        }
    }

    public static class RangedNumericValue extends com.badlogic.gdx.graphics.g2d.ParticleEmitter.ParticleValue {
        private float lowMax;
        private float lowMin;

        public RangedNumericValue() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.ParticleValue
        public void load(java.io.BufferedReader r2) throws java.io.IOException {
                r1 = this;
                super.load(r2)
                boolean r0 = r1.active
                if (r0 != 0) goto L8
                return
            L8:
                java.lang.String r0 = "lowMin"
                float r0 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.readFloat(r2, r0)
                r1.lowMin = r0
                java.lang.String r0 = "lowMax"
                float r2 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.readFloat(r2, r0)
                r1.lowMax = r2
                return
        }
    }

    public static class ScaledNumericValue extends com.badlogic.gdx.graphics.g2d.ParticleEmitter.RangedNumericValue {
        private float highMax;
        private float highMin;
        private boolean relative;
        private float[] scaling;
        float[] timeline;

        public ScaledNumericValue() {
                r4 = this;
                r4.<init>()
                r0 = 1
                float[] r1 = new float[r0]
                r2 = 1065353216(0x3f800000, float:1.0)
                r3 = 0
                r1[r3] = r2
                r4.scaling = r1
                float[] r0 = new float[r0]
                r1 = 0
                r0[r3] = r1
                r4.timeline = r0
                return
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.RangedNumericValue, com.badlogic.gdx.graphics.g2d.ParticleEmitter.ParticleValue
        public void load(java.io.BufferedReader r6) throws java.io.IOException {
                r5 = this;
                super.load(r6)
                boolean r0 = r5.active
                if (r0 != 0) goto L8
                return
            L8:
                java.lang.String r0 = "highMin"
                float r0 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.readFloat(r6, r0)
                r5.highMin = r0
                java.lang.String r0 = "highMax"
                float r0 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.readFloat(r6, r0)
                r5.highMax = r0
                java.lang.String r0 = "relative"
                boolean r0 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.readBoolean(r6, r0)
                r5.relative = r0
                java.lang.String r0 = "scalingCount"
                int r0 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.readInt(r6, r0)
                float[] r0 = new float[r0]
                r5.scaling = r0
                r0 = 0
                r1 = 0
            L2c:
                float[] r2 = r5.scaling
                int r3 = r2.length
                if (r1 >= r3) goto L4b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "scaling"
                r3.append(r4)
                r3.append(r1)
                java.lang.String r3 = r3.toString()
                float r3 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.readFloat(r6, r3)
                r2[r1] = r3
                int r1 = r1 + 1
                goto L2c
            L4b:
                java.lang.String r1 = "timelineCount"
                int r1 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.readInt(r6, r1)
                float[] r1 = new float[r1]
                r5.timeline = r1
            L55:
                float[] r1 = r5.timeline
                int r2 = r1.length
                if (r0 >= r2) goto L74
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "timeline"
                r2.append(r3)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                float r2 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.readFloat(r6, r2)
                r1[r0] = r2
                int r0 = r0 + 1
                goto L55
            L74:
                return
        }
    }

    public enum SpawnEllipseSide extends java.lang.Enum<com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnEllipseSide> {
        private static final /* synthetic */ com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnEllipseSide[] $VALUES = null;
        public static final com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnEllipseSide both = null;
        public static final com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnEllipseSide bottom = null;
        public static final com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnEllipseSide top = null;

        static {
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnEllipseSide r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnEllipseSide
                java.lang.String r1 = "both"
                r2 = 0
                r0.<init>(r1, r2)
                com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnEllipseSide.both = r0
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnEllipseSide r1 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnEllipseSide
                java.lang.String r3 = "top"
                r4 = 1
                r1.<init>(r3, r4)
                com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnEllipseSide.top = r1
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnEllipseSide r3 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnEllipseSide
                java.lang.String r5 = "bottom"
                r6 = 2
                r3.<init>(r5, r6)
                com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnEllipseSide.bottom = r3
                r5 = 3
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnEllipseSide[] r5 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnEllipseSide[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnEllipseSide.$VALUES = r5
                return
        }

        SpawnEllipseSide(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnEllipseSide valueOf(java.lang.String r1) {
                java.lang.Class<com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnEllipseSide> r0 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnEllipseSide.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnEllipseSide r1 = (com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnEllipseSide) r1
                return r1
        }

        public static com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnEllipseSide[] values() {
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnEllipseSide[] r0 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnEllipseSide.$VALUES
                java.lang.Object r0 = r0.clone()
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnEllipseSide[] r0 = (com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnEllipseSide[]) r0
                return r0
        }
    }

    public enum SpawnShape extends java.lang.Enum<com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnShape> {
        private static final /* synthetic */ com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnShape[] $VALUES = null;
        public static final com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnShape ellipse = null;
        public static final com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnShape line = null;
        public static final com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnShape point = null;
        public static final com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnShape square = null;

        static {
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnShape r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnShape
                java.lang.String r1 = "point"
                r2 = 0
                r0.<init>(r1, r2)
                com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnShape.point = r0
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnShape r1 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnShape
                java.lang.String r3 = "line"
                r4 = 1
                r1.<init>(r3, r4)
                com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnShape.line = r1
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnShape r3 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnShape
                java.lang.String r5 = "square"
                r6 = 2
                r3.<init>(r5, r6)
                com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnShape.square = r3
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnShape r5 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnShape
                java.lang.String r7 = "ellipse"
                r8 = 3
                r5.<init>(r7, r8)
                com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnShape.ellipse = r5
                r7 = 4
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnShape[] r7 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnShape[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnShape.$VALUES = r7
                return
        }

        SpawnShape(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnShape valueOf(java.lang.String r1) {
                java.lang.Class<com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnShape> r0 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnShape.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnShape r1 = (com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnShape) r1
                return r1
        }

        public static com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnShape[] values() {
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnShape[] r0 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnShape.$VALUES
                java.lang.Object r0 = r0.clone()
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnShape[] r0 = (com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnShape[]) r0
                return r0
        }
    }

    public static class SpawnShapeValue extends com.badlogic.gdx.graphics.g2d.ParticleEmitter.ParticleValue {
        boolean edges;
        com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnShape shape;
        com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnEllipseSide side;

        public SpawnShapeValue() {
                r1 = this;
                r1.<init>()
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnShape r0 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnShape.point
                r1.shape = r0
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnEllipseSide r0 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnEllipseSide.both
                r1.side = r0
                return
        }

        @Override // com.badlogic.gdx.graphics.g2d.ParticleEmitter.ParticleValue
        public void load(java.io.BufferedReader r3) throws java.io.IOException {
                r2 = this;
                super.load(r3)
                boolean r0 = r2.active
                if (r0 != 0) goto L8
                return
            L8:
                java.lang.String r0 = "shape"
                java.lang.String r0 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.readString(r3, r0)
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnShape r0 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnShape.valueOf(r0)
                r2.shape = r0
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnShape r1 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnShape.ellipse
                if (r0 != r1) goto L2c
                java.lang.String r0 = "edges"
                boolean r0 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.readBoolean(r3, r0)
                r2.edges = r0
                java.lang.String r0 = "side"
                java.lang.String r3 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.readString(r3, r0)
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnEllipseSide r3 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpawnEllipseSide.valueOf(r3)
                r2.side = r3
            L2c:
                return
        }
    }

    public enum SpriteMode extends java.lang.Enum<com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpriteMode> {
        private static final /* synthetic */ com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpriteMode[] $VALUES = null;
        public static final com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpriteMode animated = null;
        public static final com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpriteMode random = null;
        public static final com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpriteMode single = null;

        static {
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpriteMode r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpriteMode
                java.lang.String r1 = "single"
                r2 = 0
                r0.<init>(r1, r2)
                com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpriteMode.single = r0
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpriteMode r1 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpriteMode
                java.lang.String r3 = "random"
                r4 = 1
                r1.<init>(r3, r4)
                com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpriteMode.random = r1
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpriteMode r3 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpriteMode
                java.lang.String r5 = "animated"
                r6 = 2
                r3.<init>(r5, r6)
                com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpriteMode.animated = r3
                r5 = 3
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpriteMode[] r5 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpriteMode[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpriteMode.$VALUES = r5
                return
        }

        SpriteMode(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpriteMode valueOf(java.lang.String r1) {
                java.lang.Class<com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpriteMode> r0 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpriteMode.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpriteMode r1 = (com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpriteMode) r1
                return r1
        }

        public static com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpriteMode[] values() {
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpriteMode[] r0 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpriteMode.$VALUES
                java.lang.Object r0 = r0.clone()
                com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpriteMode[] r0 = (com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpriteMode[]) r0
                return r0
        }
    }

    public ParticleEmitter() {
            r2 = this;
            r2.<init>()
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$RangedNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$RangedNumericValue
            r0.<init>()
            r2.delayValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$IndependentScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$IndependentScaledNumericValue
            r0.<init>()
            r2.lifeOffsetValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$RangedNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$RangedNumericValue
            r0.<init>()
            r2.durationValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$IndependentScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$IndependentScaledNumericValue
            r0.<init>()
            r2.lifeValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue
            r0.<init>()
            r2.emissionValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue
            r0.<init>()
            r2.xScaleValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue
            r0.<init>()
            r2.yScaleValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue
            r0.<init>()
            r2.rotationValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue
            r0.<init>()
            r2.velocityValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue
            r0.<init>()
            r2.angleValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue
            r0.<init>()
            r2.windValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue
            r0.<init>()
            r2.gravityValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue
            r0.<init>()
            r2.transparencyValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$GradientColorValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$GradientColorValue
            r0.<init>()
            r2.tintValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue
            r0.<init>()
            r2.xOffsetValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue
            r0.<init>()
            r2.yOffsetValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue
            r0.<init>()
            r2.spawnWidthValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue
            r0.<init>()
            r2.spawnHeightValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnShapeValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnShapeValue
            r0.<init>()
            r2.spawnShapeValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpriteMode r0 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpriteMode.single
            r2.spriteMode = r0
            r0 = 4
            r2.maxParticleCount = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.duration = r0
            r0 = 1
            r2.additive = r0
            r1 = 0
            r2.premultipliedAlpha = r1
            r2.cleansUpBlendFunction = r0
            r2.initialize()
            return
    }

    public ParticleEmitter(java.io.BufferedReader r3) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$RangedNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$RangedNumericValue
            r0.<init>()
            r2.delayValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$IndependentScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$IndependentScaledNumericValue
            r0.<init>()
            r2.lifeOffsetValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$RangedNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$RangedNumericValue
            r0.<init>()
            r2.durationValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$IndependentScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$IndependentScaledNumericValue
            r0.<init>()
            r2.lifeValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue
            r0.<init>()
            r2.emissionValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue
            r0.<init>()
            r2.xScaleValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue
            r0.<init>()
            r2.yScaleValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue
            r0.<init>()
            r2.rotationValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue
            r0.<init>()
            r2.velocityValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue
            r0.<init>()
            r2.angleValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue
            r0.<init>()
            r2.windValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue
            r0.<init>()
            r2.gravityValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue
            r0.<init>()
            r2.transparencyValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$GradientColorValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$GradientColorValue
            r0.<init>()
            r2.tintValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue
            r0.<init>()
            r2.xOffsetValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue
            r0.<init>()
            r2.yOffsetValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue
            r0.<init>()
            r2.spawnWidthValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue
            r0.<init>()
            r2.spawnHeightValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnShapeValue r0 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnShapeValue
            r0.<init>()
            r2.spawnShapeValue = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpriteMode r0 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpriteMode.single
            r2.spriteMode = r0
            r0 = 4
            r2.maxParticleCount = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.duration = r0
            r0 = 1
            r2.additive = r0
            r1 = 0
            r2.premultipliedAlpha = r1
            r2.cleansUpBlendFunction = r0
            r2.initialize()
            r2.load(r3)
            return
    }

    private void initialize() {
            r2 = this;
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r2.sprites = r0
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r2.imagePaths = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$RangedNumericValue r0 = r2.durationValue
            r1 = 1
            r0.setAlwaysActive(r1)
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = r2.emissionValue
            r0.setAlwaysActive(r1)
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$IndependentScaledNumericValue r0 = r2.lifeValue
            r0.setAlwaysActive(r1)
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = r2.xScaleValue
            r0.setAlwaysActive(r1)
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = r2.transparencyValue
            r0.setAlwaysActive(r1)
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnShapeValue r0 = r2.spawnShapeValue
            r0.setAlwaysActive(r1)
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = r2.spawnWidthValue
            r0.setAlwaysActive(r1)
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = r2.spawnHeightValue
            r0.setAlwaysActive(r1)
            return
    }

    static boolean readBoolean(java.io.BufferedReader r0, java.lang.String r1) throws java.io.IOException {
            java.lang.String r0 = readString(r0, r1)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            return r0
    }

    static boolean readBoolean(java.lang.String r0) throws java.io.IOException {
            java.lang.String r0 = readString(r0)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            return r0
    }

    static float readFloat(java.io.BufferedReader r0, java.lang.String r1) throws java.io.IOException {
            java.lang.String r0 = readString(r0, r1)
            float r0 = java.lang.Float.parseFloat(r0)
            return r0
    }

    static int readInt(java.io.BufferedReader r0, java.lang.String r1) throws java.io.IOException {
            java.lang.String r0 = readString(r0, r1)
            int r0 = java.lang.Integer.parseInt(r0)
            return r0
    }

    static java.lang.String readString(java.io.BufferedReader r2, java.lang.String r3) throws java.io.IOException {
            java.lang.String r2 = r2.readLine()
            if (r2 == 0) goto Lb
            java.lang.String r2 = readString(r2)
            return r2
        Lb:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Missing value: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    static java.lang.String readString(java.lang.String r1) throws java.io.IOException {
            java.lang.String r0 = ":"
            int r0 = r1.indexOf(r0)
            int r0 = r0 + 1
            java.lang.String r1 = r1.substring(r0)
            java.lang.String r1 = r1.trim()
            return r1
    }

    public com.badlogic.gdx.utils.Array<java.lang.String> getImagePaths() {
            r1 = this;
            com.badlogic.gdx.utils.Array<java.lang.String> r0 = r1.imagePaths
            return r0
    }

    public com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.Sprite> getSprites() {
            r1 = this;
            com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.Sprite> r0 = r1.sprites
            return r0
    }

    public void load(java.io.BufferedReader r4) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "name"
            java.lang.String r0 = readString(r4, r0)     // Catch: java.lang.RuntimeException -> L13d
            r3.name = r0     // Catch: java.lang.RuntimeException -> L13d
            r4.readLine()     // Catch: java.lang.RuntimeException -> L13d
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$RangedNumericValue r0 = r3.delayValue     // Catch: java.lang.RuntimeException -> L13d
            r0.load(r4)     // Catch: java.lang.RuntimeException -> L13d
            r4.readLine()     // Catch: java.lang.RuntimeException -> L13d
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$RangedNumericValue r0 = r3.durationValue     // Catch: java.lang.RuntimeException -> L13d
            r0.load(r4)     // Catch: java.lang.RuntimeException -> L13d
            r4.readLine()     // Catch: java.lang.RuntimeException -> L13d
            java.lang.String r0 = "minParticleCount"
            int r0 = readInt(r4, r0)     // Catch: java.lang.RuntimeException -> L13d
            r3.setMinParticleCount(r0)     // Catch: java.lang.RuntimeException -> L13d
            java.lang.String r0 = "maxParticleCount"
            int r0 = readInt(r4, r0)     // Catch: java.lang.RuntimeException -> L13d
            r3.setMaxParticleCount(r0)     // Catch: java.lang.RuntimeException -> L13d
            r4.readLine()     // Catch: java.lang.RuntimeException -> L13d
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = r3.emissionValue     // Catch: java.lang.RuntimeException -> L13d
            r0.load(r4)     // Catch: java.lang.RuntimeException -> L13d
            r4.readLine()     // Catch: java.lang.RuntimeException -> L13d
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$IndependentScaledNumericValue r0 = r3.lifeValue     // Catch: java.lang.RuntimeException -> L13d
            r0.load(r4)     // Catch: java.lang.RuntimeException -> L13d
            r4.readLine()     // Catch: java.lang.RuntimeException -> L13d
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$IndependentScaledNumericValue r0 = r3.lifeOffsetValue     // Catch: java.lang.RuntimeException -> L13d
            r0.load(r4)     // Catch: java.lang.RuntimeException -> L13d
            r4.readLine()     // Catch: java.lang.RuntimeException -> L13d
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$RangedNumericValue r0 = r3.xOffsetValue     // Catch: java.lang.RuntimeException -> L13d
            r0.load(r4)     // Catch: java.lang.RuntimeException -> L13d
            r4.readLine()     // Catch: java.lang.RuntimeException -> L13d
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$RangedNumericValue r0 = r3.yOffsetValue     // Catch: java.lang.RuntimeException -> L13d
            r0.load(r4)     // Catch: java.lang.RuntimeException -> L13d
            r4.readLine()     // Catch: java.lang.RuntimeException -> L13d
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpawnShapeValue r0 = r3.spawnShapeValue     // Catch: java.lang.RuntimeException -> L13d
            r0.load(r4)     // Catch: java.lang.RuntimeException -> L13d
            r4.readLine()     // Catch: java.lang.RuntimeException -> L13d
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = r3.spawnWidthValue     // Catch: java.lang.RuntimeException -> L13d
            r0.load(r4)     // Catch: java.lang.RuntimeException -> L13d
            r4.readLine()     // Catch: java.lang.RuntimeException -> L13d
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = r3.spawnHeightValue     // Catch: java.lang.RuntimeException -> L13d
            r0.load(r4)     // Catch: java.lang.RuntimeException -> L13d
            java.lang.String r0 = r4.readLine()     // Catch: java.lang.RuntimeException -> L13d
            java.lang.String r0 = r0.trim()     // Catch: java.lang.RuntimeException -> L13d
            java.lang.String r1 = "- Scale -"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.RuntimeException -> L13d
            if (r0 == 0) goto L89
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = r3.xScaleValue     // Catch: java.lang.RuntimeException -> L13d
            r0.load(r4)     // Catch: java.lang.RuntimeException -> L13d
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = r3.yScaleValue     // Catch: java.lang.RuntimeException -> L13d
            r1 = 0
            r0.setActive(r1)     // Catch: java.lang.RuntimeException -> L13d
            goto L96
        L89:
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = r3.xScaleValue     // Catch: java.lang.RuntimeException -> L13d
            r0.load(r4)     // Catch: java.lang.RuntimeException -> L13d
            r4.readLine()     // Catch: java.lang.RuntimeException -> L13d
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = r3.yScaleValue     // Catch: java.lang.RuntimeException -> L13d
            r0.load(r4)     // Catch: java.lang.RuntimeException -> L13d
        L96:
            r4.readLine()     // Catch: java.lang.RuntimeException -> L13d
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = r3.velocityValue     // Catch: java.lang.RuntimeException -> L13d
            r0.load(r4)     // Catch: java.lang.RuntimeException -> L13d
            r4.readLine()     // Catch: java.lang.RuntimeException -> L13d
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = r3.angleValue     // Catch: java.lang.RuntimeException -> L13d
            r0.load(r4)     // Catch: java.lang.RuntimeException -> L13d
            r4.readLine()     // Catch: java.lang.RuntimeException -> L13d
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = r3.rotationValue     // Catch: java.lang.RuntimeException -> L13d
            r0.load(r4)     // Catch: java.lang.RuntimeException -> L13d
            r4.readLine()     // Catch: java.lang.RuntimeException -> L13d
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = r3.windValue     // Catch: java.lang.RuntimeException -> L13d
            r0.load(r4)     // Catch: java.lang.RuntimeException -> L13d
            r4.readLine()     // Catch: java.lang.RuntimeException -> L13d
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = r3.gravityValue     // Catch: java.lang.RuntimeException -> L13d
            r0.load(r4)     // Catch: java.lang.RuntimeException -> L13d
            r4.readLine()     // Catch: java.lang.RuntimeException -> L13d
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$GradientColorValue r0 = r3.tintValue     // Catch: java.lang.RuntimeException -> L13d
            r0.load(r4)     // Catch: java.lang.RuntimeException -> L13d
            r4.readLine()     // Catch: java.lang.RuntimeException -> L13d
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$ScaledNumericValue r0 = r3.transparencyValue     // Catch: java.lang.RuntimeException -> L13d
            r0.load(r4)     // Catch: java.lang.RuntimeException -> L13d
            r4.readLine()     // Catch: java.lang.RuntimeException -> L13d
            java.lang.String r0 = "attached"
            boolean r0 = readBoolean(r4, r0)     // Catch: java.lang.RuntimeException -> L13d
            r3.attached = r0     // Catch: java.lang.RuntimeException -> L13d
            java.lang.String r0 = "continuous"
            boolean r0 = readBoolean(r4, r0)     // Catch: java.lang.RuntimeException -> L13d
            r3.continuous = r0     // Catch: java.lang.RuntimeException -> L13d
            java.lang.String r0 = "aligned"
            boolean r0 = readBoolean(r4, r0)     // Catch: java.lang.RuntimeException -> L13d
            r3.aligned = r0     // Catch: java.lang.RuntimeException -> L13d
            java.lang.String r0 = "additive"
            boolean r0 = readBoolean(r4, r0)     // Catch: java.lang.RuntimeException -> L13d
            r3.additive = r0     // Catch: java.lang.RuntimeException -> L13d
            java.lang.String r0 = "behind"
            boolean r0 = readBoolean(r4, r0)     // Catch: java.lang.RuntimeException -> L13d
            r3.behind = r0     // Catch: java.lang.RuntimeException -> L13d
            java.lang.String r0 = r4.readLine()     // Catch: java.lang.RuntimeException -> L13d
            java.lang.String r1 = "premultipliedAlpha"
            boolean r1 = r0.startsWith(r1)     // Catch: java.lang.RuntimeException -> L13d
            if (r1 == 0) goto L10f
            boolean r0 = readBoolean(r0)     // Catch: java.lang.RuntimeException -> L13d
            r3.premultipliedAlpha = r0     // Catch: java.lang.RuntimeException -> L13d
            java.lang.String r0 = r4.readLine()     // Catch: java.lang.RuntimeException -> L13d
        L10f:
            java.lang.String r1 = "spriteMode"
            boolean r1 = r0.startsWith(r1)     // Catch: java.lang.RuntimeException -> L13d
            if (r1 == 0) goto L124
            java.lang.String r0 = readString(r0)     // Catch: java.lang.RuntimeException -> L13d
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$SpriteMode r0 = com.badlogic.gdx.graphics.g2d.ParticleEmitter.SpriteMode.valueOf(r0)     // Catch: java.lang.RuntimeException -> L13d
            r3.spriteMode = r0     // Catch: java.lang.RuntimeException -> L13d
            r4.readLine()     // Catch: java.lang.RuntimeException -> L13d
        L124:
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array     // Catch: java.lang.RuntimeException -> L13d
            r0.<init>()     // Catch: java.lang.RuntimeException -> L13d
        L129:
            java.lang.String r1 = r4.readLine()     // Catch: java.lang.RuntimeException -> L13d
            if (r1 == 0) goto L139
            boolean r2 = r1.isEmpty()     // Catch: java.lang.RuntimeException -> L13d
            if (r2 != 0) goto L139
            r0.add(r1)     // Catch: java.lang.RuntimeException -> L13d
            goto L129
        L139:
            r3.setImagePaths(r0)     // Catch: java.lang.RuntimeException -> L13d
            return
        L13d:
            r4 = move-exception
            java.lang.String r0 = r3.name
            if (r0 != 0) goto L143
            throw r4
        L143:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error parsing emitter: "
            r1.append(r2)
            java.lang.String r2 = r3.name
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            throw r0
    }

    public void setImagePaths(com.badlogic.gdx.utils.Array<java.lang.String> r1) {
            r0 = this;
            r0.imagePaths = r1
            return
    }

    public void setMaxParticleCount(int r2) {
            r1 = this;
            r1.maxParticleCount = r2
            boolean[] r0 = new boolean[r2]
            r1.active = r0
            r0 = 0
            r1.activeCount = r0
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$Particle[] r2 = new com.badlogic.gdx.graphics.g2d.ParticleEmitter.Particle[r2]
            r1.particles = r2
            return
    }

    public void setMinParticleCount(int r1) {
            r0 = this;
            r0.minParticleCount = r1
            return
    }

    public void setSprites(com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.Sprite> r3) {
            r2 = this;
            r2.sprites = r3
            int r3 = r3.size
            if (r3 != 0) goto L7
            return
        L7:
            com.badlogic.gdx.graphics.g2d.ParticleEmitter$Particle[] r3 = r2.particles
            int r0 = r3.length
            r1 = 0
            if (r0 <= 0) goto Lf
            r3 = r3[r1]
        Lf:
            return
    }
}
