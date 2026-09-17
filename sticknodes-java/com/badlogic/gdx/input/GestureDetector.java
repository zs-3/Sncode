package com.badlogic.gdx.input;

/* loaded from: classes.dex */
public class GestureDetector extends com.badlogic.gdx.InputAdapter {
    private boolean inTapRectangle;
    private final com.badlogic.gdx.math.Vector2 initialPointer1;
    private final com.badlogic.gdx.math.Vector2 initialPointer2;
    private int lastTapButton;
    private int lastTapPointer;
    private long lastTapTime;
    private float lastTapX;
    private float lastTapY;
    final com.badlogic.gdx.input.GestureDetector.GestureListener listener;
    boolean longPressFired;
    private float longPressSeconds;
    private final com.badlogic.gdx.utils.Timer.Task longPressTask;
    private long maxFlingDelay;
    private boolean panning;
    private boolean pinching;
    com.badlogic.gdx.math.Vector2 pointer1;
    private final com.badlogic.gdx.math.Vector2 pointer2;
    private int tapCount;
    private long tapCountInterval;
    private float tapRectangleCenterX;
    private float tapRectangleCenterY;
    private float tapRectangleHeight;
    private float tapRectangleWidth;
    private long touchDownTime;
    private final com.badlogic.gdx.input.GestureDetector.VelocityTracker tracker;


    public static class GestureAdapter implements com.badlogic.gdx.input.GestureDetector.GestureListener {
        public GestureAdapter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
        public boolean fling(float r1, float r2, int r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
        public boolean longPress(float r1, float r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
        public boolean pan(float r1, float r2, float r3, float r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
        public boolean panStop(float r1, float r2, int r3, int r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
        public boolean pinch(com.badlogic.gdx.math.Vector2 r1, com.badlogic.gdx.math.Vector2 r2, com.badlogic.gdx.math.Vector2 r3, com.badlogic.gdx.math.Vector2 r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
        public void pinchStop() {
                r0 = this;
                return
        }

        @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
        public boolean tap(float r1, float r2, int r3, int r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
        public boolean touchDown(float r1, float r2, int r3, int r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // com.badlogic.gdx.input.GestureDetector.GestureListener
        public boolean zoom(float r1, float r2) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    public interface GestureListener {
        boolean fling(float r1, float r2, int r3);

        boolean longPress(float r1, float r2);

        boolean pan(float r1, float r2, float r3, float r4);

        boolean panStop(float r1, float r2, int r3, int r4);

        boolean pinch(com.badlogic.gdx.math.Vector2 r1, com.badlogic.gdx.math.Vector2 r2, com.badlogic.gdx.math.Vector2 r3, com.badlogic.gdx.math.Vector2 r4);

        void pinchStop();

        boolean tap(float r1, float r2, int r3, int r4);

        boolean touchDown(float r1, float r2, int r3, int r4);

        boolean zoom(float r1, float r2);
    }

    static class VelocityTracker {
        float deltaX;
        float deltaY;
        long lastTime;
        float lastX;
        float lastY;
        long[] meanTime;
        float[] meanX;
        float[] meanY;
        int numSamples;
        int sampleSize;

        VelocityTracker() {
                r2 = this;
                r2.<init>()
                r0 = 10
                r2.sampleSize = r0
                float[] r1 = new float[r0]
                r2.meanX = r1
                float[] r1 = new float[r0]
                r2.meanY = r1
                long[] r0 = new long[r0]
                r2.meanTime = r0
                return
        }

        private float getAverage(float[] r4, int r5) {
                r3 = this;
                int r0 = r3.sampleSize
                int r5 = java.lang.Math.min(r0, r5)
                r0 = 0
                r1 = 0
            L8:
                if (r1 >= r5) goto L10
                r2 = r4[r1]
                float r0 = r0 + r2
                int r1 = r1 + 1
                goto L8
            L10:
                float r4 = (float) r5
                float r0 = r0 / r4
                return r0
        }

        private long getAverage(long[] r8, int r9) {
                r7 = this;
                int r0 = r7.sampleSize
                int r9 = java.lang.Math.min(r0, r9)
                r0 = 0
                r2 = 0
                r3 = r0
            La:
                if (r2 >= r9) goto L12
                r5 = r8[r2]
                long r3 = r3 + r5
                int r2 = r2 + 1
                goto La
            L12:
                if (r9 != 0) goto L15
                return r0
            L15:
                long r8 = (long) r9
                long r3 = r3 / r8
                return r3
        }

        public float getVelocityX() {
                r4 = this;
                float[] r0 = r4.meanX
                int r1 = r4.numSamples
                float r0 = r4.getAverage(r0, r1)
                long[] r1 = r4.meanTime
                int r2 = r4.numSamples
                long r1 = r4.getAverage(r1, r2)
                float r1 = (float) r1
                r2 = 1315859240(0x4e6e6b28, float:1.0E9)
                float r1 = r1 / r2
                r2 = 0
                int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r3 != 0) goto L1b
                return r2
            L1b:
                float r0 = r0 / r1
                return r0
        }

        public float getVelocityY() {
                r4 = this;
                float[] r0 = r4.meanY
                int r1 = r4.numSamples
                float r0 = r4.getAverage(r0, r1)
                long[] r1 = r4.meanTime
                int r2 = r4.numSamples
                long r1 = r4.getAverage(r1, r2)
                float r1 = (float) r1
                r2 = 1315859240(0x4e6e6b28, float:1.0E9)
                float r1 = r1 / r2
                r2 = 0
                int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r3 != 0) goto L1b
                return r2
            L1b:
                float r0 = r0 / r1
                return r0
        }

        public void start(float r4, float r5, long r6) {
                r3 = this;
                r3.lastX = r4
                r3.lastY = r5
                r4 = 0
                r3.deltaX = r4
                r3.deltaY = r4
                r5 = 0
                r3.numSamples = r5
            Lc:
                int r0 = r3.sampleSize
                if (r5 >= r0) goto L21
                float[] r0 = r3.meanX
                r0[r5] = r4
                float[] r0 = r3.meanY
                r0[r5] = r4
                long[] r0 = r3.meanTime
                r1 = 0
                r0[r5] = r1
                int r5 = r5 + 1
                goto Lc
            L21:
                r3.lastTime = r6
                return
        }

        public void update(float r4, float r5, long r6) {
                r3 = this;
                float r0 = r3.lastX
                float r0 = r4 - r0
                r3.deltaX = r0
                float r1 = r3.lastY
                float r1 = r5 - r1
                r3.deltaY = r1
                r3.lastX = r4
                r3.lastY = r5
                long r4 = r3.lastTime
                long r4 = r6 - r4
                r3.lastTime = r6
                int r6 = r3.numSamples
                int r7 = r3.sampleSize
                int r7 = r6 % r7
                float[] r2 = r3.meanX
                r2[r7] = r0
                float[] r0 = r3.meanY
                r0[r7] = r1
                long[] r0 = r3.meanTime
                r0[r7] = r4
                int r6 = r6 + 1
                r3.numSamples = r6
                return
        }
    }

    public GestureDetector(float r2, float r3, float r4, float r5, float r6, com.badlogic.gdx.input.GestureDetector.GestureListener r7) {
            r1 = this;
            r1.<init>()
            com.badlogic.gdx.input.GestureDetector$VelocityTracker r0 = new com.badlogic.gdx.input.GestureDetector$VelocityTracker
            r0.<init>()
            r1.tracker = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            r1.pointer1 = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            r1.pointer2 = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            r1.initialPointer1 = r0
            com.badlogic.gdx.math.Vector2 r0 = new com.badlogic.gdx.math.Vector2
            r0.<init>()
            r1.initialPointer2 = r0
            com.badlogic.gdx.input.GestureDetector$1 r0 = new com.badlogic.gdx.input.GestureDetector$1
            r0.<init>(r1)
            r1.longPressTask = r0
            if (r7 == 0) goto L45
            r1.tapRectangleWidth = r2
            r1.tapRectangleHeight = r3
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r4 = r4 * r2
            long r3 = (long) r4
            r1.tapCountInterval = r3
            r1.longPressSeconds = r5
            float r6 = r6 * r2
            long r2 = (long) r6
            r1.maxFlingDelay = r2
            r1.listener = r7
            return
        L45:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "listener cannot be null."
            r2.<init>(r3)
            throw r2
    }

    public GestureDetector(float r8, float r9, float r10, float r11, com.badlogic.gdx.input.GestureDetector.GestureListener r12) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public GestureDetector(com.badlogic.gdx.input.GestureDetector.GestureListener r7) {
            r6 = this;
            r1 = 1101004800(0x41a00000, float:20.0)
            r2 = 1053609165(0x3ecccccd, float:0.4)
            r3 = 1066192077(0x3f8ccccd, float:1.1)
            r4 = 1325400064(0x4f000000, float:2.14748365E9)
            r0 = r6
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private boolean isWithinTapRectangle(float r1, float r2, float r3, float r4) {
            r0 = this;
            float r1 = r1 - r3
            float r1 = java.lang.Math.abs(r1)
            float r3 = r0.tapRectangleWidth
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L18
            float r2 = r2 - r4
            float r1 = java.lang.Math.abs(r2)
            float r2 = r0.tapRectangleHeight
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            return r1
    }

    public void cancel() {
            r1 = this;
            com.badlogic.gdx.utils.Timer$Task r0 = r1.longPressTask
            r0.cancel()
            r0 = 1
            r1.longPressFired = r0
            return
    }

    public boolean isPanning() {
            r1 = this;
            boolean r0 = r1.panning
            return r0
    }

    public void reset() {
            r3 = this;
            r0 = 0
            r3.touchDownTime = r0
            r2 = 0
            r3.panning = r2
            r3.inTapRectangle = r2
            com.badlogic.gdx.input.GestureDetector$VelocityTracker r2 = r3.tracker
            r2.lastTime = r0
            return
    }

    public void setTapRectangleSize(float r1, float r2) {
            r0 = this;
            r0.tapRectangleWidth = r1
            r0.tapRectangleHeight = r2
            return
    }

    public void setTapSquareSize(float r1) {
            r0 = this;
            r0.setTapRectangleSize(r1, r1)
            return
    }

    @Override // com.badlogic.gdx.InputAdapter, com.badlogic.gdx.InputProcessor
    public boolean touchCancelled(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.cancel()
            boolean r1 = super.touchCancelled(r1, r2, r3, r4)
            return r1
    }

    public boolean touchDown(float r6, float r7, int r8, int r9) {
            r5 = this;
            r0 = 0
            r1 = 1
            if (r8 <= r1) goto L5
            return r0
        L5:
            if (r8 != 0) goto L53
            com.badlogic.gdx.math.Vector2 r2 = r5.pointer1
            r2.set(r6, r7)
            com.badlogic.gdx.Input r2 = com.badlogic.gdx.Gdx.input
            long r2 = r2.getCurrentEventTime()
            r5.touchDownTime = r2
            com.badlogic.gdx.input.GestureDetector$VelocityTracker r4 = r5.tracker
            r4.start(r6, r7, r2)
            com.badlogic.gdx.Input r2 = com.badlogic.gdx.Gdx.input
            boolean r2 = r2.isTouched(r1)
            if (r2 == 0) goto L39
            r5.inTapRectangle = r0
            r5.pinching = r1
            com.badlogic.gdx.math.Vector2 r0 = r5.initialPointer1
            com.badlogic.gdx.math.Vector2 r1 = r5.pointer1
            r0.set(r1)
            com.badlogic.gdx.math.Vector2 r0 = r5.initialPointer2
            com.badlogic.gdx.math.Vector2 r1 = r5.pointer2
            r0.set(r1)
            com.badlogic.gdx.utils.Timer$Task r0 = r5.longPressTask
            r0.cancel()
            goto L6f
        L39:
            r5.inTapRectangle = r1
            r5.pinching = r0
            r5.longPressFired = r0
            r5.tapRectangleCenterX = r6
            r5.tapRectangleCenterY = r7
            com.badlogic.gdx.utils.Timer$Task r0 = r5.longPressTask
            boolean r0 = r0.isScheduled()
            if (r0 != 0) goto L6f
            com.badlogic.gdx.utils.Timer$Task r0 = r5.longPressTask
            float r1 = r5.longPressSeconds
            com.badlogic.gdx.utils.Timer.schedule(r0, r1)
            goto L6f
        L53:
            com.badlogic.gdx.math.Vector2 r2 = r5.pointer2
            r2.set(r6, r7)
            r5.inTapRectangle = r0
            r5.pinching = r1
            com.badlogic.gdx.math.Vector2 r0 = r5.initialPointer1
            com.badlogic.gdx.math.Vector2 r1 = r5.pointer1
            r0.set(r1)
            com.badlogic.gdx.math.Vector2 r0 = r5.initialPointer2
            com.badlogic.gdx.math.Vector2 r1 = r5.pointer2
            r0.set(r1)
            com.badlogic.gdx.utils.Timer$Task r0 = r5.longPressTask
            r0.cancel()
        L6f:
            com.badlogic.gdx.input.GestureDetector$GestureListener r0 = r5.listener
            boolean r6 = r0.touchDown(r6, r7, r8, r9)
            return r6
    }

    @Override // com.badlogic.gdx.InputProcessor
    public boolean touchDown(int r1, int r2, int r3, int r4) {
            r0 = this;
            float r1 = (float) r1
            float r2 = (float) r2
            boolean r1 = r0.touchDown(r1, r2, r3, r4)
            return r1
    }

    public boolean touchDragged(float r5, float r6, int r7) {
            r4 = this;
            r0 = 1
            r1 = 0
            if (r7 <= r0) goto L5
            return r1
        L5:
            boolean r2 = r4.longPressFired
            if (r2 == 0) goto La
            return r1
        La:
            if (r7 != 0) goto L12
            com.badlogic.gdx.math.Vector2 r7 = r4.pointer1
            r7.set(r5, r6)
            goto L17
        L12:
            com.badlogic.gdx.math.Vector2 r7 = r4.pointer2
            r7.set(r5, r6)
        L17:
            boolean r7 = r4.pinching
            if (r7 == 0) goto L46
            com.badlogic.gdx.input.GestureDetector$GestureListener r5 = r4.listener
            com.badlogic.gdx.math.Vector2 r6 = r4.initialPointer1
            com.badlogic.gdx.math.Vector2 r7 = r4.initialPointer2
            com.badlogic.gdx.math.Vector2 r2 = r4.pointer1
            com.badlogic.gdx.math.Vector2 r3 = r4.pointer2
            boolean r5 = r5.pinch(r6, r7, r2, r3)
            com.badlogic.gdx.input.GestureDetector$GestureListener r6 = r4.listener
            com.badlogic.gdx.math.Vector2 r7 = r4.initialPointer1
            com.badlogic.gdx.math.Vector2 r2 = r4.initialPointer2
            float r7 = r7.dst(r2)
            com.badlogic.gdx.math.Vector2 r2 = r4.pointer1
            com.badlogic.gdx.math.Vector2 r3 = r4.pointer2
            float r2 = r2.dst(r3)
            boolean r6 = r6.zoom(r7, r2)
            if (r6 != 0) goto L45
            if (r5 == 0) goto L44
            goto L45
        L44:
            r0 = 0
        L45:
            return r0
        L46:
            com.badlogic.gdx.input.GestureDetector$VelocityTracker r7 = r4.tracker
            com.badlogic.gdx.Input r2 = com.badlogic.gdx.Gdx.input
            long r2 = r2.getCurrentEventTime()
            r7.update(r5, r6, r2)
            boolean r7 = r4.inTapRectangle
            if (r7 == 0) goto L66
            float r7 = r4.tapRectangleCenterX
            float r2 = r4.tapRectangleCenterY
            boolean r7 = r4.isWithinTapRectangle(r5, r6, r7, r2)
            if (r7 != 0) goto L66
            com.badlogic.gdx.utils.Timer$Task r7 = r4.longPressTask
            r7.cancel()
            r4.inTapRectangle = r1
        L66:
            boolean r7 = r4.inTapRectangle
            if (r7 != 0) goto L79
            r4.panning = r0
            com.badlogic.gdx.input.GestureDetector$GestureListener r7 = r4.listener
            com.badlogic.gdx.input.GestureDetector$VelocityTracker r0 = r4.tracker
            float r1 = r0.deltaX
            float r0 = r0.deltaY
            boolean r5 = r7.pan(r5, r6, r1, r0)
            return r5
        L79:
            return r1
    }

    @Override // com.badlogic.gdx.InputProcessor
    public boolean touchDragged(int r1, int r2, int r3) {
            r0 = this;
            float r1 = (float) r1
            float r2 = (float) r2
            boolean r1 = r0.touchDragged(r1, r2, r3)
            return r1
    }

    public boolean touchUp(float r12, float r13, int r14, int r15) {
            r11 = this;
            r0 = 1
            r1 = 0
            if (r14 <= r0) goto L5
            return r1
        L5:
            boolean r2 = r11.inTapRectangle
            if (r2 == 0) goto L15
            float r2 = r11.tapRectangleCenterX
            float r3 = r11.tapRectangleCenterY
            boolean r2 = r11.isWithinTapRectangle(r12, r13, r2, r3)
            if (r2 != 0) goto L15
            r11.inTapRectangle = r1
        L15:
            boolean r2 = r11.panning
            r11.panning = r1
            com.badlogic.gdx.utils.Timer$Task r3 = r11.longPressTask
            r3.cancel()
            boolean r3 = r11.longPressFired
            if (r3 == 0) goto L23
            return r1
        L23:
            boolean r3 = r11.inTapRectangle
            r4 = 0
            if (r3 == 0) goto L68
            int r2 = r11.lastTapButton
            if (r2 != r15) goto L48
            int r2 = r11.lastTapPointer
            if (r2 != r14) goto L48
            long r2 = com.badlogic.gdx.utils.TimeUtils.nanoTime()
            long r6 = r11.lastTapTime
            long r2 = r2 - r6
            long r6 = r11.tapCountInterval
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 > 0) goto L48
            float r2 = r11.lastTapX
            float r3 = r11.lastTapY
            boolean r2 = r11.isWithinTapRectangle(r12, r13, r2, r3)
            if (r2 != 0) goto L4a
        L48:
            r11.tapCount = r1
        L4a:
            int r1 = r11.tapCount
            int r1 = r1 + r0
            r11.tapCount = r1
            long r0 = com.badlogic.gdx.utils.TimeUtils.nanoTime()
            r11.lastTapTime = r0
            r11.lastTapX = r12
            r11.lastTapY = r13
            r11.lastTapButton = r15
            r11.lastTapPointer = r14
            r11.touchDownTime = r4
            com.badlogic.gdx.input.GestureDetector$GestureListener r14 = r11.listener
            int r0 = r11.tapCount
            boolean r12 = r14.tap(r12, r13, r0, r15)
            return r12
        L68:
            boolean r3 = r11.pinching
            if (r3 == 0) goto L9b
            r11.pinching = r1
            com.badlogic.gdx.input.GestureDetector$GestureListener r12 = r11.listener
            r12.pinchStop()
            r11.panning = r0
            if (r14 != 0) goto L89
            com.badlogic.gdx.input.GestureDetector$VelocityTracker r12 = r11.tracker
            com.badlogic.gdx.math.Vector2 r13 = r11.pointer2
            float r14 = r13.x
            float r13 = r13.y
            com.badlogic.gdx.Input r15 = com.badlogic.gdx.Gdx.input
            long r2 = r15.getCurrentEventTime()
            r12.start(r14, r13, r2)
            goto L9a
        L89:
            com.badlogic.gdx.input.GestureDetector$VelocityTracker r12 = r11.tracker
            com.badlogic.gdx.math.Vector2 r13 = r11.pointer1
            float r14 = r13.x
            float r13 = r13.y
            com.badlogic.gdx.Input r15 = com.badlogic.gdx.Gdx.input
            long r2 = r15.getCurrentEventTime()
            r12.start(r14, r13, r2)
        L9a:
            return r1
        L9b:
            if (r2 == 0) goto La8
            boolean r2 = r11.panning
            if (r2 != 0) goto La8
            com.badlogic.gdx.input.GestureDetector$GestureListener r2 = r11.listener
            boolean r14 = r2.panStop(r12, r13, r14, r15)
            goto La9
        La8:
            r14 = 0
        La9:
            com.badlogic.gdx.Input r2 = com.badlogic.gdx.Gdx.input
            long r2 = r2.getCurrentEventTime()
            long r6 = r11.touchDownTime
            long r6 = r2 - r6
            long r8 = r11.maxFlingDelay
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 > 0) goto Ld7
            com.badlogic.gdx.input.GestureDetector$VelocityTracker r6 = r11.tracker
            r6.update(r12, r13, r2)
            com.badlogic.gdx.input.GestureDetector$GestureListener r12 = r11.listener
            com.badlogic.gdx.input.GestureDetector$VelocityTracker r13 = r11.tracker
            float r13 = r13.getVelocityX()
            com.badlogic.gdx.input.GestureDetector$VelocityTracker r2 = r11.tracker
            float r2 = r2.getVelocityY()
            boolean r12 = r12.fling(r13, r2, r15)
            if (r12 != 0) goto Ld6
            if (r14 == 0) goto Ld5
            goto Ld6
        Ld5:
            r0 = 0
        Ld6:
            r14 = r0
        Ld7:
            r11.touchDownTime = r4
            return r14
    }

    @Override // com.badlogic.gdx.InputProcessor
    public boolean touchUp(int r1, int r2, int r3, int r4) {
            r0 = this;
            float r1 = (float) r1
            float r2 = (float) r2
            boolean r1 = r0.touchUp(r1, r2, r3, r4)
            return r1
    }
}
