package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public class DefaultAndroidInput extends com.badlogic.gdx.AbstractInput implements com.badlogic.gdx.backends.android.AndroidInput {
    public static final int NUM_TOUCHES = 20;
    final float[] R;
    public boolean accelerometerAvailable;
    private android.hardware.SensorEventListener accelerometerListener;
    protected final float[] accelerometerValues;
    final com.badlogic.gdx.Application app;
    private float azimuth;
    int[] button;
    private boolean compassAvailable;
    private android.hardware.SensorEventListener compassListener;
    private final com.badlogic.gdx.backends.android.AndroidApplicationConfiguration config;
    final android.content.Context context;
    private long currentEventTimeStamp;
    int[] deltaX;
    int[] deltaY;
    private final java.util.ArrayList<android.view.View.OnGenericMotionListener> genericMotionListeners;
    public boolean gyroscopeAvailable;
    private android.hardware.SensorEventListener gyroscopeListener;
    protected final float[] gyroscopeValues;
    private android.os.Handler handle;
    protected final com.badlogic.gdx.backends.android.AndroidHaptics haptics;
    final boolean hasMultitouch;
    private boolean[] justPressedButtons;
    private boolean justTouched;
    java.util.ArrayList<com.badlogic.gdx.backends.android.DefaultAndroidInput.KeyEvent> keyEvents;
    java.util.ArrayList<android.view.View.OnKeyListener> keyListeners;
    boolean keyboardAvailable;
    protected final float[] magneticFieldValues;
    private android.hardware.SensorManager manager;
    private final com.badlogic.gdx.backends.android.AndroidMouseHandler mouseHandler;
    protected final com.badlogic.gdx.Input.Orientation nativeOrientation;
    final float[] orientation;
    private float pitch;
    float[] pressure;
    private com.badlogic.gdx.InputProcessor processor;
    int[] realId;
    boolean requestFocus;
    private float roll;
    private boolean rotationVectorAvailable;
    private android.hardware.SensorEventListener rotationVectorListener;
    protected final float[] rotationVectorValues;
    private int sleepTime;
    java.util.ArrayList<com.badlogic.gdx.backends.android.DefaultAndroidInput.TouchEvent> touchEvents;
    protected final com.badlogic.gdx.backends.android.AndroidTouchHandler touchHandler;
    int[] touchX;
    int[] touchY;
    boolean[] touched;
    com.badlogic.gdx.utils.Pool<com.badlogic.gdx.backends.android.DefaultAndroidInput.KeyEvent> usedKeyEvents;
    com.badlogic.gdx.utils.Pool<com.badlogic.gdx.backends.android.DefaultAndroidInput.TouchEvent> usedTouchEvents;



    /* renamed from: com.badlogic.gdx.backends.android.DefaultAndroidInput$3, reason: invalid class name */
    class AnonymousClass3 implements java.lang.Runnable {
        final /* synthetic */ com.badlogic.gdx.backends.android.DefaultAndroidInput this$0;
        final /* synthetic */ java.lang.String val$hint;
        final /* synthetic */ com.badlogic.gdx.Input.OnscreenKeyboardType val$keyboardType;
        final /* synthetic */ com.badlogic.gdx.Input.TextInputListener val$listener;
        final /* synthetic */ java.lang.String val$text;
        final /* synthetic */ java.lang.String val$title;




        AnonymousClass3(com.badlogic.gdx.backends.android.DefaultAndroidInput r1, java.lang.String r2, com.badlogic.gdx.Input.OnscreenKeyboardType r3, java.lang.String r4, java.lang.String r5, com.badlogic.gdx.Input.TextInputListener r6) {
                r0 = this;
                r0.this$0 = r1
                r0.val$title = r2
                r0.val$keyboardType = r3
                r0.val$hint = r4
                r0.val$text = r5
                r0.val$listener = r6
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
                com.badlogic.gdx.backends.android.DefaultAndroidInput r1 = r4.this$0
                android.content.Context r1 = r1.context
                r0.<init>(r1)
                java.lang.String r1 = r4.val$title
                r0.setTitle(r1)
                android.widget.EditText r1 = new android.widget.EditText
                com.badlogic.gdx.backends.android.DefaultAndroidInput r2 = r4.this$0
                android.content.Context r2 = r2.context
                r1.<init>(r2)
                com.badlogic.gdx.Input$OnscreenKeyboardType r2 = r4.val$keyboardType
                com.badlogic.gdx.Input$OnscreenKeyboardType r3 = com.badlogic.gdx.Input.OnscreenKeyboardType.Default
                if (r2 == r3) goto L24
                int r2 = com.badlogic.gdx.backends.android.DefaultAndroidInput.getAndroidInputType(r2)
                r1.setInputType(r2)
            L24:
                java.lang.String r2 = r4.val$hint
                r1.setHint(r2)
                java.lang.String r2 = r4.val$text
                r1.setText(r2)
                r1.setSingleLine()
                com.badlogic.gdx.Input$OnscreenKeyboardType r2 = r4.val$keyboardType
                com.badlogic.gdx.Input$OnscreenKeyboardType r3 = com.badlogic.gdx.Input.OnscreenKeyboardType.Password
                if (r2 != r3) goto L3f
                android.text.method.PasswordTransformationMethod r2 = new android.text.method.PasswordTransformationMethod
                r2.<init>()
                r1.setTransformationMethod(r2)
            L3f:
                r0.setView(r1)
                com.badlogic.gdx.backends.android.DefaultAndroidInput r2 = r4.this$0
                android.content.Context r2 = r2.context
                r3 = 17039370(0x104000a, float:2.42446E-38)
                java.lang.String r2 = r2.getString(r3)
                com.badlogic.gdx.backends.android.DefaultAndroidInput$3$1 r3 = new com.badlogic.gdx.backends.android.DefaultAndroidInput$3$1
                r3.<init>(r4, r1)
                r0.setPositiveButton(r2, r3)
                com.badlogic.gdx.backends.android.DefaultAndroidInput r1 = r4.this$0
                android.content.Context r1 = r1.context
                r2 = 17039360(0x1040000, float:2.424457E-38)
                java.lang.String r1 = r1.getString(r2)
                com.badlogic.gdx.backends.android.DefaultAndroidInput$3$2 r2 = new com.badlogic.gdx.backends.android.DefaultAndroidInput$3$2
                r2.<init>(r4)
                r0.setNegativeButton(r1, r2)
                com.badlogic.gdx.backends.android.DefaultAndroidInput$3$3 r1 = new com.badlogic.gdx.backends.android.DefaultAndroidInput$3$3
                r1.<init>(r4)
                r0.setOnCancelListener(r1)
                r0.show()
                return
        }
    }


    /* renamed from: com.badlogic.gdx.backends.android.DefaultAndroidInput$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$com$badlogic$gdx$Input$OnscreenKeyboardType = null;

        static {
                com.badlogic.gdx.Input$OnscreenKeyboardType[] r0 = com.badlogic.gdx.Input.OnscreenKeyboardType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.badlogic.gdx.backends.android.DefaultAndroidInput.AnonymousClass5.$SwitchMap$com$badlogic$gdx$Input$OnscreenKeyboardType = r0
                com.badlogic.gdx.Input$OnscreenKeyboardType r1 = com.badlogic.gdx.Input.OnscreenKeyboardType.NumberPad     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.badlogic.gdx.backends.android.DefaultAndroidInput.AnonymousClass5.$SwitchMap$com$badlogic$gdx$Input$OnscreenKeyboardType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.badlogic.gdx.Input$OnscreenKeyboardType r1 = com.badlogic.gdx.Input.OnscreenKeyboardType.PhonePad     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.badlogic.gdx.backends.android.DefaultAndroidInput.AnonymousClass5.$SwitchMap$com$badlogic$gdx$Input$OnscreenKeyboardType     // Catch: java.lang.NoSuchFieldError -> L28
                com.badlogic.gdx.Input$OnscreenKeyboardType r1 = com.badlogic.gdx.Input.OnscreenKeyboardType.Email     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.badlogic.gdx.backends.android.DefaultAndroidInput.AnonymousClass5.$SwitchMap$com$badlogic$gdx$Input$OnscreenKeyboardType     // Catch: java.lang.NoSuchFieldError -> L33
                com.badlogic.gdx.Input$OnscreenKeyboardType r1 = com.badlogic.gdx.Input.OnscreenKeyboardType.Password     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.badlogic.gdx.backends.android.DefaultAndroidInput.AnonymousClass5.$SwitchMap$com$badlogic$gdx$Input$OnscreenKeyboardType     // Catch: java.lang.NoSuchFieldError -> L3e
                com.badlogic.gdx.Input$OnscreenKeyboardType r1 = com.badlogic.gdx.Input.OnscreenKeyboardType.URI     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }
    }

    static class KeyEvent {
        static final int KEY_DOWN = 0;
        static final int KEY_TYPED = 2;
        static final int KEY_UP = 1;
        char keyChar;
        int keyCode;
        long timeStamp;
        int type;

        KeyEvent() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private class SensorListener implements android.hardware.SensorEventListener {
        final /* synthetic */ com.badlogic.gdx.backends.android.DefaultAndroidInput this$0;

        public SensorListener(com.badlogic.gdx.backends.android.DefaultAndroidInput r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(android.hardware.Sensor r1, int r2) {
                r0 = this;
                return
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(android.hardware.SensorEvent r7) {
                r6 = this;
                android.hardware.Sensor r0 = r7.sensor
                int r0 = r0.getType()
                r1 = 2
                r2 = 1
                r3 = 0
                if (r0 != r2) goto L2d
                com.badlogic.gdx.backends.android.DefaultAndroidInput r0 = r6.this$0
                com.badlogic.gdx.Input$Orientation r4 = r0.nativeOrientation
                com.badlogic.gdx.Input$Orientation r5 = com.badlogic.gdx.Input.Orientation.Portrait
                if (r4 != r5) goto L1c
                float[] r4 = r7.values
                float[] r0 = r0.accelerometerValues
                int r5 = r0.length
                java.lang.System.arraycopy(r4, r3, r0, r3, r5)
                goto L2d
            L1c:
                float[] r0 = r0.accelerometerValues
                float[] r4 = r7.values
                r5 = r4[r2]
                r0[r3] = r5
                r5 = r4[r3]
                float r5 = -r5
                r0[r2] = r5
                r4 = r4[r1]
                r0[r1] = r4
            L2d:
                android.hardware.Sensor r0 = r7.sensor
                int r0 = r0.getType()
                if (r0 != r1) goto L3f
                float[] r0 = r7.values
                com.badlogic.gdx.backends.android.DefaultAndroidInput r4 = r6.this$0
                float[] r4 = r4.magneticFieldValues
                int r5 = r4.length
                java.lang.System.arraycopy(r0, r3, r4, r3, r5)
            L3f:
                android.hardware.Sensor r0 = r7.sensor
                int r0 = r0.getType()
                r4 = 4
                if (r0 != r4) goto L6a
                com.badlogic.gdx.backends.android.DefaultAndroidInput r0 = r6.this$0
                com.badlogic.gdx.Input$Orientation r4 = r0.nativeOrientation
                com.badlogic.gdx.Input$Orientation r5 = com.badlogic.gdx.Input.Orientation.Portrait
                if (r4 != r5) goto L59
                float[] r4 = r7.values
                float[] r0 = r0.gyroscopeValues
                int r5 = r0.length
                java.lang.System.arraycopy(r4, r3, r0, r3, r5)
                goto L6a
            L59:
                float[] r0 = r0.gyroscopeValues
                float[] r4 = r7.values
                r5 = r4[r2]
                r0[r3] = r5
                r5 = r4[r3]
                float r5 = -r5
                r0[r2] = r5
                r4 = r4[r1]
                r0[r1] = r4
            L6a:
                android.hardware.Sensor r0 = r7.sensor
                int r0 = r0.getType()
                r4 = 11
                if (r0 != r4) goto L96
                com.badlogic.gdx.backends.android.DefaultAndroidInput r0 = r6.this$0
                com.badlogic.gdx.Input$Orientation r4 = r0.nativeOrientation
                com.badlogic.gdx.Input$Orientation r5 = com.badlogic.gdx.Input.Orientation.Portrait
                if (r4 != r5) goto L85
                float[] r7 = r7.values
                float[] r0 = r0.rotationVectorValues
                int r1 = r0.length
                java.lang.System.arraycopy(r7, r3, r0, r3, r1)
                goto L96
            L85:
                float[] r0 = r0.rotationVectorValues
                float[] r7 = r7.values
                r4 = r7[r2]
                r0[r3] = r4
                r3 = r7[r3]
                float r3 = -r3
                r0[r2] = r3
                r7 = r7[r1]
                r0[r1] = r7
            L96:
                return
        }
    }

    static class TouchEvent {
        static final int TOUCH_CANCELLED = 5;
        static final int TOUCH_DOWN = 0;
        static final int TOUCH_DRAGGED = 2;
        static final int TOUCH_MOVED = 4;
        static final int TOUCH_SCROLLED = 3;
        static final int TOUCH_UP = 1;
        int button;
        int pointer;
        int scrollAmountX;
        int scrollAmountY;
        long timeStamp;
        int type;
        int x;
        int y;

        TouchEvent() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public DefaultAndroidInput(com.badlogic.gdx.Application r5, android.content.Context r6, java.lang.Object r7, com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r8) {
            r4 = this;
            r4.<init>()
            com.badlogic.gdx.backends.android.DefaultAndroidInput$1 r0 = new com.badlogic.gdx.backends.android.DefaultAndroidInput$1
            r1 = 16
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.<init>(r4, r1, r2)
            r4.usedKeyEvents = r0
            com.badlogic.gdx.backends.android.DefaultAndroidInput$2 r0 = new com.badlogic.gdx.backends.android.DefaultAndroidInput$2
            r0.<init>(r4, r1, r2)
            r4.usedTouchEvents = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.keyListeners = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.keyEvents = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.touchEvents = r0
            r0 = 20
            int[] r1 = new int[r0]
            r4.touchX = r1
            int[] r1 = new int[r0]
            r4.touchY = r1
            int[] r1 = new int[r0]
            r4.deltaX = r1
            int[] r1 = new int[r0]
            r4.deltaY = r1
            boolean[] r1 = new boolean[r0]
            r4.touched = r1
            int[] r1 = new int[r0]
            r4.button = r1
            int[] r1 = new int[r0]
            r4.realId = r1
            float[] r1 = new float[r0]
            r4.pressure = r1
            boolean[] r0 = new boolean[r0]
            r4.justPressedButtons = r0
            r0 = 0
            r4.accelerometerAvailable = r0
            r1 = 3
            float[] r2 = new float[r1]
            r4.accelerometerValues = r2
            r4.gyroscopeAvailable = r0
            float[] r2 = new float[r1]
            r4.gyroscopeValues = r2
            r4.sleepTime = r0
            r4.compassAvailable = r0
            r4.rotationVectorAvailable = r0
            float[] r2 = new float[r1]
            r4.magneticFieldValues = r2
            float[] r2 = new float[r1]
            r4.rotationVectorValues = r2
            r2 = 0
            r4.azimuth = r2
            r4.pitch = r2
            r4.roll = r2
            r4.justTouched = r0
            r2 = 0
            r4.currentEventTimeStamp = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.genericMotionListeners = r2
            r2 = 1
            r4.requestFocus = r2
            r3 = 9
            float[] r3 = new float[r3]
            r4.R = r3
            float[] r1 = new float[r1]
            r4.orientation = r1
            boolean r1 = r7 instanceof android.view.View
            if (r1 == 0) goto La5
            android.view.View r7 = (android.view.View) r7
            r7.setOnKeyListener(r4)
            r7.setOnTouchListener(r4)
            r7.setFocusable(r2)
            r7.setFocusableInTouchMode(r2)
            r7.requestFocus()
            r7.setOnGenericMotionListener(r4)
        La5:
            r4.config = r8
            com.badlogic.gdx.backends.android.AndroidMouseHandler r7 = new com.badlogic.gdx.backends.android.AndroidMouseHandler
            r7.<init>()
            r4.mouseHandler = r7
        Lae:
            int[] r7 = r4.realId
            int r1 = r7.length
            if (r0 >= r1) goto Lb9
            r1 = -1
            r7[r0] = r1
            int r0 = r0 + 1
            goto Lae
        Lb9:
            android.os.Handler r7 = new android.os.Handler
            r7.<init>()
            r4.handle = r7
            r4.app = r5
            r4.context = r6
            int r7 = r8.touchSleepTime
            r4.sleepTime = r7
            com.badlogic.gdx.backends.android.AndroidTouchHandler r7 = new com.badlogic.gdx.backends.android.AndroidTouchHandler
            r7.<init>()
            r4.touchHandler = r7
            boolean r7 = r7.supportsMultitouch(r6)
            r4.hasMultitouch = r7
            com.badlogic.gdx.backends.android.AndroidHaptics r7 = new com.badlogic.gdx.backends.android.AndroidHaptics
            r7.<init>(r6)
            r4.haptics = r7
            int r6 = r4.getRotation()
            com.badlogic.gdx.Graphics r5 = r5.getGraphics()
            com.badlogic.gdx.Graphics$DisplayMode r5 = r5.getDisplayMode()
            if (r6 == 0) goto Lee
            r7 = 180(0xb4, float:2.52E-43)
            if (r6 != r7) goto Lf4
        Lee:
            int r7 = r5.width
            int r8 = r5.height
            if (r7 >= r8) goto L108
        Lf4:
            r7 = 90
            if (r6 == r7) goto Lfc
            r7 = 270(0x10e, float:3.78E-43)
            if (r6 != r7) goto L103
        Lfc:
            int r6 = r5.width
            int r5 = r5.height
            if (r6 > r5) goto L103
            goto L108
        L103:
            com.badlogic.gdx.Input$Orientation r5 = com.badlogic.gdx.Input.Orientation.Portrait
            r4.nativeOrientation = r5
            goto L10c
        L108:
            com.badlogic.gdx.Input$Orientation r5 = com.badlogic.gdx.Input.Orientation.Landscape
            r4.nativeOrientation = r5
        L10c:
            r5 = 255(0xff, float:3.57E-43)
            r4.setCatchKey(r5, r2)
            return
    }

    public static int getAndroidInputType(com.badlogic.gdx.Input.OnscreenKeyboardType r3) {
            int[] r0 = com.badlogic.gdx.backends.android.DefaultAndroidInput.AnonymousClass5.$SwitchMap$com$badlogic$gdx$Input$OnscreenKeyboardType
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            r1 = 3
            r2 = 2
            if (r3 == r0) goto L23
            if (r3 == r2) goto L24
            if (r3 == r1) goto L20
            r0 = 4
            if (r3 == r0) goto L1d
            r0 = 5
            if (r3 == r0) goto L1a
            r1 = 144(0x90, float:2.02E-43)
            goto L24
        L1a:
            r1 = 17
            goto L24
        L1d:
            r1 = 129(0x81, float:1.81E-43)
            goto L24
        L20:
            r1 = 33
            goto L24
        L23:
            r1 = 2
        L24:
            return r1
    }

    private float[] resize(float[] r4) {
            r3 = this;
            int r0 = r4.length
            int r0 = r0 + 2
            float[] r0 = new float[r0]
            int r1 = r4.length
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r0, r2, r1)
            return r0
    }

    private int[] resize(int[] r4) {
            r3 = this;
            int r0 = r4.length
            int r0 = r0 + 2
            int[] r0 = new int[r0]
            int r1 = r4.length
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r0, r2, r1)
            return r0
    }

    private boolean[] resize(boolean[] r4) {
            r3 = this;
            int r0 = r4.length
            int r0 = r0 + 2
            boolean[] r0 = new boolean[r0]
            int r1 = r4.length
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r0, r2, r1)
            return r0
    }

    private void updateOrientation() {
            r4 = this;
            boolean r0 = r4.rotationVectorAvailable
            if (r0 == 0) goto Lc
            float[] r0 = r4.R
            float[] r1 = r4.rotationVectorValues
            android.hardware.SensorManager.getRotationMatrixFromVector(r0, r1)
            goto L1a
        Lc:
            float[] r0 = r4.R
            r1 = 0
            float[] r2 = r4.accelerometerValues
            float[] r3 = r4.magneticFieldValues
            boolean r0 = android.hardware.SensorManager.getRotationMatrix(r0, r1, r2, r3)
            if (r0 != 0) goto L1a
            return
        L1a:
            float[] r0 = r4.R
            float[] r1 = r4.orientation
            android.hardware.SensorManager.getOrientation(r0, r1)
            float[] r0 = r4.orientation
            r1 = 0
            r0 = r0[r1]
            double r0 = (double) r0
            double r0 = java.lang.Math.toDegrees(r0)
            float r0 = (float) r0
            r4.azimuth = r0
            float[] r0 = r4.orientation
            r1 = 1
            r0 = r0[r1]
            double r0 = (double) r0
            double r0 = java.lang.Math.toDegrees(r0)
            float r0 = (float) r0
            r4.pitch = r0
            float[] r0 = r4.orientation
            r1 = 2
            r0 = r0[r1]
            double r0 = (double) r0
            double r0 = java.lang.Math.toDegrees(r0)
            float r0 = (float) r0
            r4.roll = r0
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public void addGenericMotionListener(android.view.View.OnGenericMotionListener r2) {
            r1 = this;
            java.util.ArrayList<android.view.View$OnGenericMotionListener> r0 = r1.genericMotionListeners
            r0.add(r2)
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public void addKeyListener(android.view.View.OnKeyListener r2) {
            r1 = this;
            java.util.ArrayList<android.view.View$OnKeyListener> r0 = r1.keyListeners
            r0.add(r2)
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public float getAccelerometerX() {
            r2 = this;
            float[] r0 = r2.accelerometerValues
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public float getAccelerometerY() {
            r2 = this;
            float[] r0 = r2.accelerometerValues
            r1 = 1
            r0 = r0[r1]
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public float getAccelerometerZ() {
            r2 = this;
            float[] r0 = r2.accelerometerValues
            r1 = 2
            r0 = r0[r1]
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public float getAzimuth() {
            r1 = this;
            boolean r0 = r1.compassAvailable
            if (r0 != 0) goto La
            boolean r0 = r1.rotationVectorAvailable
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            r1.updateOrientation()
            float r0 = r1.azimuth
            return r0
    }

    @Override // com.badlogic.gdx.Input
    public long getCurrentEventTime() {
            r2 = this;
            long r0 = r2.currentEventTimeStamp
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public int getDeltaX() {
            r2 = this;
            int[] r0 = r2.deltaX
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public int getDeltaX(int r2) {
            r1 = this;
            int[] r0 = r1.deltaX
            r2 = r0[r2]
            return r2
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public int getDeltaY() {
            r2 = this;
            int[] r0 = r2.deltaY
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public int getDeltaY(int r2) {
            r1 = this;
            int[] r0 = r1.deltaY
            r2 = r0[r2]
            return r2
    }

    public int getFreePointerIndex() {
            r4 = this;
            int[] r0 = r4.realId
            int r0 = r0.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L11
            int[] r2 = r4.realId
            r2 = r2[r1]
            r3 = -1
            if (r2 != r3) goto Le
            return r1
        Le:
            int r1 = r1 + 1
            goto L4
        L11:
            float[] r1 = r4.pressure
            float[] r1 = r4.resize(r1)
            r4.pressure = r1
            int[] r1 = r4.realId
            int[] r1 = r4.resize(r1)
            r4.realId = r1
            int[] r1 = r4.touchX
            int[] r1 = r4.resize(r1)
            r4.touchX = r1
            int[] r1 = r4.touchY
            int[] r1 = r4.resize(r1)
            r4.touchY = r1
            int[] r1 = r4.deltaX
            int[] r1 = r4.resize(r1)
            r4.deltaX = r1
            int[] r1 = r4.deltaY
            int[] r1 = r4.resize(r1)
            r4.deltaY = r1
            boolean[] r1 = r4.touched
            boolean[] r1 = r4.resize(r1)
            r4.touched = r1
            int[] r1 = r4.button
            int[] r1 = r4.resize(r1)
            r4.button = r1
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public float getGyroscopeX() {
            r2 = this;
            float[] r0 = r2.gyroscopeValues
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public float getGyroscopeY() {
            r2 = this;
            float[] r0 = r2.gyroscopeValues
            r1 = 1
            r0 = r0[r1]
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public float getGyroscopeZ() {
            r2 = this;
            float[] r0 = r2.gyroscopeValues
            r1 = 2
            r0 = r0[r1]
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public com.badlogic.gdx.InputProcessor getInputProcessor() {
            r1 = this;
            com.badlogic.gdx.InputProcessor r0 = r1.processor
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public int getMaxPointers() {
            r1 = this;
            r0 = 20
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public com.badlogic.gdx.Input.Orientation getNativeOrientation() {
            r1 = this;
            com.badlogic.gdx.Input$Orientation r0 = r1.nativeOrientation
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public float getPitch() {
            r1 = this;
            boolean r0 = r1.compassAvailable
            if (r0 != 0) goto La
            boolean r0 = r1.rotationVectorAvailable
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            r1.updateOrientation()
            float r0 = r1.pitch
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public float getPressure() {
            r1 = this;
            r0 = 0
            float r0 = r1.getPressure(r0)
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public float getPressure(int r2) {
            r1 = this;
            float[] r0 = r1.pressure
            r2 = r0[r2]
            return r2
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public float getRoll() {
            r1 = this;
            boolean r0 = r1.compassAvailable
            if (r0 != 0) goto La
            boolean r0 = r1.rotationVectorAvailable
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            r1.updateOrientation()
            float r0 = r1.roll
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public int getRotation() {
            r2 = this;
            android.content.Context r0 = r2.context
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L15
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.WindowManager r0 = r0.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            int r0 = r0.getRotation()
            goto L25
        L15:
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            int r0 = r0.getRotation()
        L25:
            r1 = 1
            if (r0 == r1) goto L36
            r1 = 2
            if (r0 == r1) goto L33
            r1 = 3
            if (r0 == r1) goto L30
            r0 = 0
            return r0
        L30:
            r0 = 270(0x10e, float:3.78E-43)
            return r0
        L33:
            r0 = 180(0xb4, float:2.52E-43)
            return r0
        L36:
            r0 = 90
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public void getRotationMatrix(float[] r4) {
            r3 = this;
            boolean r0 = r3.rotationVectorAvailable
            if (r0 == 0) goto La
            float[] r0 = r3.rotationVectorValues
            android.hardware.SensorManager.getRotationMatrixFromVector(r4, r0)
            goto L12
        La:
            r0 = 0
            float[] r1 = r3.accelerometerValues
            float[] r2 = r3.magneticFieldValues
            android.hardware.SensorManager.getRotationMatrix(r4, r0, r1, r2)
        L12:
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public void getTextInput(com.badlogic.gdx.Input.TextInputListener r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r6 = this;
            com.badlogic.gdx.Input$OnscreenKeyboardType r5 = com.badlogic.gdx.Input.OnscreenKeyboardType.Default
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.getTextInput(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public void getTextInput(com.badlogic.gdx.Input.TextInputListener r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, com.badlogic.gdx.Input.OnscreenKeyboardType r14) {
            r9 = this;
            android.os.Handler r0 = r9.handle
            com.badlogic.gdx.backends.android.DefaultAndroidInput$3 r8 = new com.badlogic.gdx.backends.android.DefaultAndroidInput$3
            r1 = r8
            r2 = r9
            r3 = r11
            r4 = r14
            r5 = r13
            r6 = r12
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.post(r8)
            return
    }

    @Override // com.badlogic.gdx.Input
    public int getX() {
            r2 = this;
            monitor-enter(r2)
            int[] r0 = r2.touchX     // Catch: java.lang.Throwable -> L8
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            return r0
        L8:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public int getX(int r2) {
            r1 = this;
            monitor-enter(r1)
            int[] r0 = r1.touchX     // Catch: java.lang.Throwable -> L7
            r2 = r0[r2]     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    @Override // com.badlogic.gdx.Input
    public int getY() {
            r2 = this;
            monitor-enter(r2)
            int[] r0 = r2.touchY     // Catch: java.lang.Throwable -> L8
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            return r0
        L8:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public int getY(int r2) {
            r1 = this;
            monitor-enter(r1)
            int[] r0 = r1.touchY     // Catch: java.lang.Throwable -> L7
            r2 = r0[r2]     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public boolean isButtonJustPressed(int r2) {
            r1 = this;
            if (r2 < 0) goto Lc
            r0 = 20
            if (r2 <= r0) goto L7
            goto Lc
        L7:
            boolean[] r0 = r1.justPressedButtons
            boolean r2 = r0[r2]
            return r2
        Lc:
            r2 = 0
            return r2
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public boolean isButtonPressed(int r5) {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.hasMultitouch     // Catch: java.lang.Throwable -> L2d
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1d
            r0 = 0
        L8:
            r3 = 20
            if (r0 >= r3) goto L1d
            boolean[] r3 = r4.touched     // Catch: java.lang.Throwable -> L2d
            boolean r3 = r3[r0]     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L1a
            int[] r3 = r4.button     // Catch: java.lang.Throwable -> L2d
            r3 = r3[r0]     // Catch: java.lang.Throwable -> L2d
            if (r3 != r5) goto L1a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2d
            return r1
        L1a:
            int r0 = r0 + 1
            goto L8
        L1d:
            boolean[] r0 = r4.touched     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0[r2]     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2a
            int[] r0 = r4.button     // Catch: java.lang.Throwable -> L2d
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L2d
            if (r0 != r5) goto L2a
            goto L2b
        L2a:
            r1 = 0
        L2b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2d
            return r1
        L2d:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2d
            throw r5
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public boolean isCursorCatched() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public boolean isPeripheralAvailable(com.badlogic.gdx.Input.Peripheral r3) {
            r2 = this;
            com.badlogic.gdx.Input$Peripheral r0 = com.badlogic.gdx.Input.Peripheral.Accelerometer
            if (r3 != r0) goto L7
            boolean r3 = r2.accelerometerAvailable
            return r3
        L7:
            com.badlogic.gdx.Input$Peripheral r0 = com.badlogic.gdx.Input.Peripheral.Gyroscope
            if (r3 != r0) goto Le
            boolean r3 = r2.gyroscopeAvailable
            return r3
        Le:
            com.badlogic.gdx.Input$Peripheral r0 = com.badlogic.gdx.Input.Peripheral.Compass
            if (r3 != r0) goto L15
            boolean r3 = r2.compassAvailable
            return r3
        L15:
            com.badlogic.gdx.Input$Peripheral r0 = com.badlogic.gdx.Input.Peripheral.HardwareKeyboard
            if (r3 != r0) goto L1c
            boolean r3 = r2.keyboardAvailable
            return r3
        L1c:
            com.badlogic.gdx.Input$Peripheral r0 = com.badlogic.gdx.Input.Peripheral.OnscreenKeyboard
            r1 = 1
            if (r3 != r0) goto L22
            return r1
        L22:
            com.badlogic.gdx.Input$Peripheral r0 = com.badlogic.gdx.Input.Peripheral.Vibrator
            if (r3 != r0) goto L2d
            com.badlogic.gdx.backends.android.AndroidHaptics r3 = r2.haptics
            boolean r3 = r3.hasVibratorAvailable()
            return r3
        L2d:
            com.badlogic.gdx.Input$Peripheral r0 = com.badlogic.gdx.Input.Peripheral.HapticFeedback
            if (r3 != r0) goto L38
            com.badlogic.gdx.backends.android.AndroidHaptics r3 = r2.haptics
            boolean r3 = r3.hasHapticsSupport()
            return r3
        L38:
            com.badlogic.gdx.Input$Peripheral r0 = com.badlogic.gdx.Input.Peripheral.MultitouchScreen
            if (r3 != r0) goto L3f
            boolean r3 = r2.hasMultitouch
            return r3
        L3f:
            com.badlogic.gdx.Input$Peripheral r0 = com.badlogic.gdx.Input.Peripheral.RotationVector
            if (r3 != r0) goto L46
            boolean r3 = r2.rotationVectorAvailable
            return r3
        L46:
            com.badlogic.gdx.Input$Peripheral r0 = com.badlogic.gdx.Input.Peripheral.Pressure
            if (r3 != r0) goto L4b
            return r1
        L4b:
            r3 = 0
            return r3
    }

    @Override // com.badlogic.gdx.Input
    public boolean isTouched() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.hasMultitouch     // Catch: java.lang.Throwable -> L1d
            r1 = 0
            if (r0 == 0) goto L17
            r0 = 0
        L7:
            r2 = 20
            if (r0 >= r2) goto L17
            boolean[] r2 = r3.touched     // Catch: java.lang.Throwable -> L1d
            boolean r2 = r2[r0]     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L14
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            r0 = 1
            return r0
        L14:
            int r0 = r0 + 1
            goto L7
        L17:
            boolean[] r0 = r3.touched     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r0[r1]     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            return r0
        L1d:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r0
    }

    @Override // com.badlogic.gdx.Input
    public boolean isTouched(int r2) {
            r1 = this;
            monitor-enter(r1)
            boolean[] r0 = r1.touched     // Catch: java.lang.Throwable -> L7
            boolean r2 = r0[r2]     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public boolean justTouched() {
            r1 = this;
            boolean r0 = r1.justTouched
            return r0
    }

    public int lookUpPointerIndex(int r6) {
            r5 = this;
            int[] r0 = r5.realId
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L5:
            if (r2 >= r0) goto L11
            int[] r3 = r5.realId
            r3 = r3[r2]
            if (r3 != r6) goto Le
            return r2
        Le:
            int r2 = r2 + 1
            goto L5
        L11:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
        L16:
            if (r1 >= r0) goto L3b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r4 = ":"
            r3.append(r4)
            int[] r4 = r5.realId
            r4 = r4[r1]
            r3.append(r4)
            java.lang.String r4 = " "
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            int r1 = r1 + 1
            goto L16
        L3b:
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Pointer ID lookup failed: "
            r1.append(r3)
            r1.append(r6)
            java.lang.String r6 = ", "
            r1.append(r6)
            java.lang.String r6 = r2.toString()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.String r1 = "AndroidInput"
            r0.log(r1, r6)
            r6 = -1
            return r6
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public void onDreamingStarted() {
            r0 = this;
            r0.registerSensorListeners()
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public void onDreamingStopped() {
            r0 = this;
            r0.unregisterSensorListeners()
            return
    }

    @Override // android.view.View.OnGenericMotionListener
    public boolean onGenericMotion(android.view.View r6, android.view.MotionEvent r7) {
            r5 = this;
            com.badlogic.gdx.backends.android.AndroidMouseHandler r0 = r5.mouseHandler
            boolean r0 = r0.onGenericMotion(r7, r5)
            r1 = 1
            if (r0 == 0) goto La
            return r1
        La:
            java.util.ArrayList<android.view.View$OnGenericMotionListener> r0 = r5.genericMotionListeners
            int r0 = r0.size()
            r2 = 0
            r3 = 0
        L12:
            if (r3 >= r0) goto L26
            java.util.ArrayList<android.view.View$OnGenericMotionListener> r4 = r5.genericMotionListeners
            java.lang.Object r4 = r4.get(r3)
            android.view.View$OnGenericMotionListener r4 = (android.view.View.OnGenericMotionListener) r4
            boolean r4 = r4.onGenericMotion(r6, r7)
            if (r4 == 0) goto L23
            return r1
        L23:
            int r3 = r3 + 1
            goto L12
        L26:
            return r2
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View r10, int r11, android.view.KeyEvent r12) {
            r9 = this;
            java.util.ArrayList<android.view.View$OnKeyListener> r0 = r9.keyListeners
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            r3 = 1
            if (r2 >= r0) goto L1d
            java.util.ArrayList<android.view.View$OnKeyListener> r4 = r9.keyListeners
            java.lang.Object r4 = r4.get(r2)
            android.view.View$OnKeyListener r4 = (android.view.View.OnKeyListener) r4
            boolean r4 = r4.onKey(r10, r11, r12)
            if (r4 == 0) goto L1a
            return r3
        L1a:
            int r2 = r2 + 1
            goto L8
        L1d:
            int r10 = r12.getAction()
            if (r10 != 0) goto L2e
            int r10 = r12.getRepeatCount()
            if (r10 <= 0) goto L2e
            boolean r10 = r9.isCatchKey(r11)
            return r10
        L2e:
            monitor-enter(r9)
            int r10 = r12.getKeyCode()     // Catch: java.lang.Throwable -> L13e
            r0 = 2
            if (r10 != 0) goto L69
            int r10 = r12.getAction()     // Catch: java.lang.Throwable -> L13e
            if (r10 != r0) goto L69
            java.lang.String r10 = r12.getCharacters()     // Catch: java.lang.Throwable -> L13e
            r11 = 0
        L41:
            int r12 = r10.length()     // Catch: java.lang.Throwable -> L13e
            if (r11 >= r12) goto L67
            com.badlogic.gdx.utils.Pool<com.badlogic.gdx.backends.android.DefaultAndroidInput$KeyEvent> r12 = r9.usedKeyEvents     // Catch: java.lang.Throwable -> L13e
            java.lang.Object r12 = r12.obtain()     // Catch: java.lang.Throwable -> L13e
            com.badlogic.gdx.backends.android.DefaultAndroidInput$KeyEvent r12 = (com.badlogic.gdx.backends.android.DefaultAndroidInput.KeyEvent) r12     // Catch: java.lang.Throwable -> L13e
            long r2 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L13e
            r12.timeStamp = r2     // Catch: java.lang.Throwable -> L13e
            r12.keyCode = r1     // Catch: java.lang.Throwable -> L13e
            char r2 = r10.charAt(r11)     // Catch: java.lang.Throwable -> L13e
            r12.keyChar = r2     // Catch: java.lang.Throwable -> L13e
            r12.type = r0     // Catch: java.lang.Throwable -> L13e
            java.util.ArrayList<com.badlogic.gdx.backends.android.DefaultAndroidInput$KeyEvent> r2 = r9.keyEvents     // Catch: java.lang.Throwable -> L13e
            r2.add(r12)     // Catch: java.lang.Throwable -> L13e
            int r11 = r11 + 1
            goto L41
        L67:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L13e
            return r1
        L69:
            int r10 = r12.getUnicodeChar()     // Catch: java.lang.Throwable -> L13e
            char r10 = (char) r10     // Catch: java.lang.Throwable -> L13e
            r2 = 67
            if (r11 != r2) goto L74
            r10 = 8
        L74:
            int r2 = r12.getKeyCode()     // Catch: java.lang.Throwable -> L13e
            if (r2 < 0) goto L13c
            int r2 = r12.getKeyCode()     // Catch: java.lang.Throwable -> L13e
            r4 = 255(0xff, float:3.57E-43)
            if (r2 <= r4) goto L84
            goto L13c
        L84:
            int r2 = r12.getAction()     // Catch: java.lang.Throwable -> L13e
            r5 = 4
            if (r2 == 0) goto Lf5
            if (r2 == r3) goto L8f
            goto L12d
        L8f:
            long r6 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L13e
            com.badlogic.gdx.utils.Pool<com.badlogic.gdx.backends.android.DefaultAndroidInput$KeyEvent> r2 = r9.usedKeyEvents     // Catch: java.lang.Throwable -> L13e
            java.lang.Object r2 = r2.obtain()     // Catch: java.lang.Throwable -> L13e
            com.badlogic.gdx.backends.android.DefaultAndroidInput$KeyEvent r2 = (com.badlogic.gdx.backends.android.DefaultAndroidInput.KeyEvent) r2     // Catch: java.lang.Throwable -> L13e
            r2.timeStamp = r6     // Catch: java.lang.Throwable -> L13e
            r2.keyChar = r1     // Catch: java.lang.Throwable -> L13e
            int r8 = r12.getKeyCode()     // Catch: java.lang.Throwable -> L13e
            r2.keyCode = r8     // Catch: java.lang.Throwable -> L13e
            r2.type = r3     // Catch: java.lang.Throwable -> L13e
            if (r11 != r5) goto Lb3
            boolean r5 = r12.isAltPressed()     // Catch: java.lang.Throwable -> L13e
            if (r5 == 0) goto Lb3
            r2.keyCode = r4     // Catch: java.lang.Throwable -> L13e
            r11 = 255(0xff, float:3.57E-43)
        Lb3:
            java.util.ArrayList<com.badlogic.gdx.backends.android.DefaultAndroidInput$KeyEvent> r5 = r9.keyEvents     // Catch: java.lang.Throwable -> L13e
            r5.add(r2)     // Catch: java.lang.Throwable -> L13e
            com.badlogic.gdx.utils.Pool<com.badlogic.gdx.backends.android.DefaultAndroidInput$KeyEvent> r2 = r9.usedKeyEvents     // Catch: java.lang.Throwable -> L13e
            java.lang.Object r2 = r2.obtain()     // Catch: java.lang.Throwable -> L13e
            com.badlogic.gdx.backends.android.DefaultAndroidInput$KeyEvent r2 = (com.badlogic.gdx.backends.android.DefaultAndroidInput.KeyEvent) r2     // Catch: java.lang.Throwable -> L13e
            r2.timeStamp = r6     // Catch: java.lang.Throwable -> L13e
            r2.keyChar = r10     // Catch: java.lang.Throwable -> L13e
            r2.keyCode = r1     // Catch: java.lang.Throwable -> L13e
            r2.type = r0     // Catch: java.lang.Throwable -> L13e
            java.util.ArrayList<com.badlogic.gdx.backends.android.DefaultAndroidInput$KeyEvent> r10 = r9.keyEvents     // Catch: java.lang.Throwable -> L13e
            r10.add(r2)     // Catch: java.lang.Throwable -> L13e
            if (r11 != r4) goto Ldd
            boolean[] r10 = r9.pressedKeys     // Catch: java.lang.Throwable -> L13e
            boolean r12 = r10[r4]     // Catch: java.lang.Throwable -> L13e
            if (r12 == 0) goto L12d
            int r12 = r9.pressedKeyCount     // Catch: java.lang.Throwable -> L13e
            int r12 = r12 - r3
            r9.pressedKeyCount = r12     // Catch: java.lang.Throwable -> L13e
            r10[r4] = r1     // Catch: java.lang.Throwable -> L13e
            goto L12d
        Ldd:
            boolean[] r10 = r9.pressedKeys     // Catch: java.lang.Throwable -> L13e
            int r0 = r12.getKeyCode()     // Catch: java.lang.Throwable -> L13e
            boolean r10 = r10[r0]     // Catch: java.lang.Throwable -> L13e
            if (r10 == 0) goto L12d
            int r10 = r9.pressedKeyCount     // Catch: java.lang.Throwable -> L13e
            int r10 = r10 - r3
            r9.pressedKeyCount = r10     // Catch: java.lang.Throwable -> L13e
            boolean[] r10 = r9.pressedKeys     // Catch: java.lang.Throwable -> L13e
            int r12 = r12.getKeyCode()     // Catch: java.lang.Throwable -> L13e
            r10[r12] = r1     // Catch: java.lang.Throwable -> L13e
            goto L12d
        Lf5:
            com.badlogic.gdx.utils.Pool<com.badlogic.gdx.backends.android.DefaultAndroidInput$KeyEvent> r10 = r9.usedKeyEvents     // Catch: java.lang.Throwable -> L13e
            java.lang.Object r10 = r10.obtain()     // Catch: java.lang.Throwable -> L13e
            com.badlogic.gdx.backends.android.DefaultAndroidInput$KeyEvent r10 = (com.badlogic.gdx.backends.android.DefaultAndroidInput.KeyEvent) r10     // Catch: java.lang.Throwable -> L13e
            long r6 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L13e
            r10.timeStamp = r6     // Catch: java.lang.Throwable -> L13e
            r10.keyChar = r1     // Catch: java.lang.Throwable -> L13e
            int r0 = r12.getKeyCode()     // Catch: java.lang.Throwable -> L13e
            r10.keyCode = r0     // Catch: java.lang.Throwable -> L13e
            r10.type = r1     // Catch: java.lang.Throwable -> L13e
            if (r11 != r5) goto L119
            boolean r12 = r12.isAltPressed()     // Catch: java.lang.Throwable -> L13e
            if (r12 == 0) goto L119
            r10.keyCode = r4     // Catch: java.lang.Throwable -> L13e
            r11 = 255(0xff, float:3.57E-43)
        L119:
            java.util.ArrayList<com.badlogic.gdx.backends.android.DefaultAndroidInput$KeyEvent> r12 = r9.keyEvents     // Catch: java.lang.Throwable -> L13e
            r12.add(r10)     // Catch: java.lang.Throwable -> L13e
            boolean[] r12 = r9.pressedKeys     // Catch: java.lang.Throwable -> L13e
            int r10 = r10.keyCode     // Catch: java.lang.Throwable -> L13e
            boolean r0 = r12[r10]     // Catch: java.lang.Throwable -> L13e
            if (r0 != 0) goto L12d
            int r0 = r9.pressedKeyCount     // Catch: java.lang.Throwable -> L13e
            int r0 = r0 + r3
            r9.pressedKeyCount = r0     // Catch: java.lang.Throwable -> L13e
            r12[r10] = r3     // Catch: java.lang.Throwable -> L13e
        L12d:
            com.badlogic.gdx.Application r10 = r9.app     // Catch: java.lang.Throwable -> L13e
            com.badlogic.gdx.Graphics r10 = r10.getGraphics()     // Catch: java.lang.Throwable -> L13e
            r10.requestRendering()     // Catch: java.lang.Throwable -> L13e
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L13e
            boolean r10 = r9.isCatchKey(r11)
            return r10
        L13c:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L13e
            return r1
        L13e:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L13e
            throw r10
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public void onPause() {
            r0 = this;
            r0.unregisterSensorListeners()
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public void onResume() {
            r0 = this;
            r0.registerSensorListeners()
            return
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View r3, android.view.MotionEvent r4) {
            r2 = this;
            boolean r0 = r2.requestFocus
            r1 = 1
            if (r0 == 0) goto L10
            if (r3 == 0) goto L10
            r3.setFocusableInTouchMode(r1)
            r3.requestFocus()
            r3 = 0
            r2.requestFocus = r3
        L10:
            com.badlogic.gdx.backends.android.AndroidTouchHandler r3 = r2.touchHandler
            r3.onTouch(r4, r2)
            int r3 = r2.sleepTime
            if (r3 == 0) goto L1d
            long r3 = (long) r3
            java.lang.Thread.sleep(r3)     // Catch: java.lang.InterruptedException -> L1d
        L1d:
            return r1
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public void processEvents() {
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.justTouched     // Catch: java.lang.Throwable -> L138
            r1 = 0
            if (r0 == 0) goto L13
            r11.justTouched = r1     // Catch: java.lang.Throwable -> L138
            r0 = 0
        L9:
            boolean[] r2 = r11.justPressedButtons     // Catch: java.lang.Throwable -> L138
            int r3 = r2.length     // Catch: java.lang.Throwable -> L138
            if (r0 >= r3) goto L13
            r2[r0] = r1     // Catch: java.lang.Throwable -> L138
            int r0 = r0 + 1
            goto L9
        L13:
            boolean r0 = r11.keyJustPressed     // Catch: java.lang.Throwable -> L138
            if (r0 == 0) goto L24
            r11.keyJustPressed = r1     // Catch: java.lang.Throwable -> L138
            r0 = 0
        L1a:
            boolean[] r2 = r11.justPressedKeys     // Catch: java.lang.Throwable -> L138
            int r3 = r2.length     // Catch: java.lang.Throwable -> L138
            if (r0 >= r3) goto L24
            r2[r0] = r1     // Catch: java.lang.Throwable -> L138
            int r0 = r0 + 1
            goto L1a
        L24:
            com.badlogic.gdx.InputProcessor r0 = r11.processor     // Catch: java.lang.Throwable -> L138
            r2 = 1
            if (r0 == 0) goto Ldf
            java.util.ArrayList<com.badlogic.gdx.backends.android.DefaultAndroidInput$KeyEvent> r3 = r11.keyEvents     // Catch: java.lang.Throwable -> L138
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L138
            r4 = 0
        L30:
            r5 = 2
            if (r4 >= r3) goto L69
            java.util.ArrayList<com.badlogic.gdx.backends.android.DefaultAndroidInput$KeyEvent> r6 = r11.keyEvents     // Catch: java.lang.Throwable -> L138
            java.lang.Object r6 = r6.get(r4)     // Catch: java.lang.Throwable -> L138
            com.badlogic.gdx.backends.android.DefaultAndroidInput$KeyEvent r6 = (com.badlogic.gdx.backends.android.DefaultAndroidInput.KeyEvent) r6     // Catch: java.lang.Throwable -> L138
            long r7 = r6.timeStamp     // Catch: java.lang.Throwable -> L138
            r11.currentEventTimeStamp = r7     // Catch: java.lang.Throwable -> L138
            int r7 = r6.type     // Catch: java.lang.Throwable -> L138
            if (r7 == 0) goto L54
            if (r7 == r2) goto L4e
            if (r7 == r5) goto L48
            goto L61
        L48:
            char r5 = r6.keyChar     // Catch: java.lang.Throwable -> L138
            r0.keyTyped(r5)     // Catch: java.lang.Throwable -> L138
            goto L61
        L4e:
            int r5 = r6.keyCode     // Catch: java.lang.Throwable -> L138
            r0.keyUp(r5)     // Catch: java.lang.Throwable -> L138
            goto L61
        L54:
            int r5 = r6.keyCode     // Catch: java.lang.Throwable -> L138
            r0.keyDown(r5)     // Catch: java.lang.Throwable -> L138
            r11.keyJustPressed = r2     // Catch: java.lang.Throwable -> L138
            boolean[] r5 = r11.justPressedKeys     // Catch: java.lang.Throwable -> L138
            int r7 = r6.keyCode     // Catch: java.lang.Throwable -> L138
            r5[r7] = r2     // Catch: java.lang.Throwable -> L138
        L61:
            com.badlogic.gdx.utils.Pool<com.badlogic.gdx.backends.android.DefaultAndroidInput$KeyEvent> r5 = r11.usedKeyEvents     // Catch: java.lang.Throwable -> L138
            r5.free(r6)     // Catch: java.lang.Throwable -> L138
            int r4 = r4 + 1
            goto L30
        L69:
            java.util.ArrayList<com.badlogic.gdx.backends.android.DefaultAndroidInput$TouchEvent> r3 = r11.touchEvents     // Catch: java.lang.Throwable -> L138
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L138
            r4 = 0
        L70:
            if (r4 >= r3) goto L115
            java.util.ArrayList<com.badlogic.gdx.backends.android.DefaultAndroidInput$TouchEvent> r6 = r11.touchEvents     // Catch: java.lang.Throwable -> L138
            java.lang.Object r6 = r6.get(r4)     // Catch: java.lang.Throwable -> L138
            com.badlogic.gdx.backends.android.DefaultAndroidInput$TouchEvent r6 = (com.badlogic.gdx.backends.android.DefaultAndroidInput.TouchEvent) r6     // Catch: java.lang.Throwable -> L138
            long r7 = r6.timeStamp     // Catch: java.lang.Throwable -> L138
            r11.currentEventTimeStamp = r7     // Catch: java.lang.Throwable -> L138
            int r7 = r6.type     // Catch: java.lang.Throwable -> L138
            if (r7 == 0) goto Lc4
            if (r7 == r2) goto Lb8
            if (r7 == r5) goto Lae
            r8 = 3
            if (r7 == r8) goto La4
            r8 = 4
            if (r7 == r8) goto L9c
            r8 = 5
            if (r7 == r8) goto L90
            goto Ld7
        L90:
            int r7 = r6.x     // Catch: java.lang.Throwable -> L138
            int r8 = r6.y     // Catch: java.lang.Throwable -> L138
            int r9 = r6.pointer     // Catch: java.lang.Throwable -> L138
            int r10 = r6.button     // Catch: java.lang.Throwable -> L138
            r0.touchCancelled(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L138
            goto Ld7
        L9c:
            int r7 = r6.x     // Catch: java.lang.Throwable -> L138
            int r8 = r6.y     // Catch: java.lang.Throwable -> L138
            r0.mouseMoved(r7, r8)     // Catch: java.lang.Throwable -> L138
            goto Ld7
        La4:
            int r7 = r6.scrollAmountX     // Catch: java.lang.Throwable -> L138
            float r7 = (float) r7     // Catch: java.lang.Throwable -> L138
            int r8 = r6.scrollAmountY     // Catch: java.lang.Throwable -> L138
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L138
            r0.scrolled(r7, r8)     // Catch: java.lang.Throwable -> L138
            goto Ld7
        Lae:
            int r7 = r6.x     // Catch: java.lang.Throwable -> L138
            int r8 = r6.y     // Catch: java.lang.Throwable -> L138
            int r9 = r6.pointer     // Catch: java.lang.Throwable -> L138
            r0.touchDragged(r7, r8, r9)     // Catch: java.lang.Throwable -> L138
            goto Ld7
        Lb8:
            int r7 = r6.x     // Catch: java.lang.Throwable -> L138
            int r8 = r6.y     // Catch: java.lang.Throwable -> L138
            int r9 = r6.pointer     // Catch: java.lang.Throwable -> L138
            int r10 = r6.button     // Catch: java.lang.Throwable -> L138
            r0.touchUp(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L138
            goto Ld7
        Lc4:
            int r7 = r6.x     // Catch: java.lang.Throwable -> L138
            int r8 = r6.y     // Catch: java.lang.Throwable -> L138
            int r9 = r6.pointer     // Catch: java.lang.Throwable -> L138
            int r10 = r6.button     // Catch: java.lang.Throwable -> L138
            r0.touchDown(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L138
            r11.justTouched = r2     // Catch: java.lang.Throwable -> L138
            boolean[] r7 = r11.justPressedButtons     // Catch: java.lang.Throwable -> L138
            int r8 = r6.button     // Catch: java.lang.Throwable -> L138
            r7[r8] = r2     // Catch: java.lang.Throwable -> L138
        Ld7:
            com.badlogic.gdx.utils.Pool<com.badlogic.gdx.backends.android.DefaultAndroidInput$TouchEvent> r7 = r11.usedTouchEvents     // Catch: java.lang.Throwable -> L138
            r7.free(r6)     // Catch: java.lang.Throwable -> L138
            int r4 = r4 + 1
            goto L70
        Ldf:
            java.util.ArrayList<com.badlogic.gdx.backends.android.DefaultAndroidInput$TouchEvent> r0 = r11.touchEvents     // Catch: java.lang.Throwable -> L138
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L138
            r3 = 0
        Le6:
            if (r3 >= r0) goto Lfe
            java.util.ArrayList<com.badlogic.gdx.backends.android.DefaultAndroidInput$TouchEvent> r4 = r11.touchEvents     // Catch: java.lang.Throwable -> L138
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L138
            com.badlogic.gdx.backends.android.DefaultAndroidInput$TouchEvent r4 = (com.badlogic.gdx.backends.android.DefaultAndroidInput.TouchEvent) r4     // Catch: java.lang.Throwable -> L138
            int r5 = r4.type     // Catch: java.lang.Throwable -> L138
            if (r5 != 0) goto Lf6
            r11.justTouched = r2     // Catch: java.lang.Throwable -> L138
        Lf6:
            com.badlogic.gdx.utils.Pool<com.badlogic.gdx.backends.android.DefaultAndroidInput$TouchEvent> r5 = r11.usedTouchEvents     // Catch: java.lang.Throwable -> L138
            r5.free(r4)     // Catch: java.lang.Throwable -> L138
            int r3 = r3 + 1
            goto Le6
        Lfe:
            java.util.ArrayList<com.badlogic.gdx.backends.android.DefaultAndroidInput$KeyEvent> r0 = r11.keyEvents     // Catch: java.lang.Throwable -> L138
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L138
            r2 = 0
        L105:
            if (r2 >= r0) goto L115
            com.badlogic.gdx.utils.Pool<com.badlogic.gdx.backends.android.DefaultAndroidInput$KeyEvent> r3 = r11.usedKeyEvents     // Catch: java.lang.Throwable -> L138
            java.util.ArrayList<com.badlogic.gdx.backends.android.DefaultAndroidInput$KeyEvent> r4 = r11.keyEvents     // Catch: java.lang.Throwable -> L138
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L138
            r3.free(r4)     // Catch: java.lang.Throwable -> L138
            int r2 = r2 + 1
            goto L105
        L115:
            java.util.ArrayList<com.badlogic.gdx.backends.android.DefaultAndroidInput$TouchEvent> r0 = r11.touchEvents     // Catch: java.lang.Throwable -> L138
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L138
            if (r0 == 0) goto L12c
            r0 = 0
        L11e:
            int[] r2 = r11.deltaX     // Catch: java.lang.Throwable -> L138
            int r3 = r2.length     // Catch: java.lang.Throwable -> L138
            if (r0 >= r3) goto L12c
            r2[r1] = r1     // Catch: java.lang.Throwable -> L138
            int[] r2 = r11.deltaY     // Catch: java.lang.Throwable -> L138
            r2[r1] = r1     // Catch: java.lang.Throwable -> L138
            int r0 = r0 + 1
            goto L11e
        L12c:
            java.util.ArrayList<com.badlogic.gdx.backends.android.DefaultAndroidInput$KeyEvent> r0 = r11.keyEvents     // Catch: java.lang.Throwable -> L138
            r0.clear()     // Catch: java.lang.Throwable -> L138
            java.util.ArrayList<com.badlogic.gdx.backends.android.DefaultAndroidInput$TouchEvent> r0 = r11.touchEvents     // Catch: java.lang.Throwable -> L138
            r0.clear()     // Catch: java.lang.Throwable -> L138
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L138
            return
        L138:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L138
            throw r0
    }

    void registerSensorListeners() {
            r7 = this;
            com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r0 = r7.config
            boolean r0 = r0.useAccelerometer
            java.lang.String r1 = "sensor"
            r2 = 0
            if (r0 == 0) goto L41
            android.content.Context r0 = r7.context
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0
            r7.manager = r0
            r3 = 1
            java.util.List r0 = r0.getSensorList(r3)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L21
            r7.accelerometerAvailable = r2
            goto L43
        L21:
            android.hardware.SensorManager r0 = r7.manager
            java.util.List r0 = r0.getSensorList(r3)
            java.lang.Object r0 = r0.get(r2)
            android.hardware.Sensor r0 = (android.hardware.Sensor) r0
            com.badlogic.gdx.backends.android.DefaultAndroidInput$SensorListener r3 = new com.badlogic.gdx.backends.android.DefaultAndroidInput$SensorListener
            r3.<init>(r7)
            r7.accelerometerListener = r3
            android.hardware.SensorManager r4 = r7.manager
            com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r5 = r7.config
            int r5 = r5.sensorDelay
            boolean r0 = r4.registerListener(r3, r0, r5)
            r7.accelerometerAvailable = r0
            goto L43
        L41:
            r7.accelerometerAvailable = r2
        L43:
            com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r0 = r7.config
            boolean r0 = r0.useGyroscope
            if (r0 == 0) goto L81
            android.content.Context r0 = r7.context
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0
            r7.manager = r0
            r3 = 4
            java.util.List r0 = r0.getSensorList(r3)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L61
            r7.gyroscopeAvailable = r2
            goto L83
        L61:
            android.hardware.SensorManager r0 = r7.manager
            java.util.List r0 = r0.getSensorList(r3)
            java.lang.Object r0 = r0.get(r2)
            android.hardware.Sensor r0 = (android.hardware.Sensor) r0
            com.badlogic.gdx.backends.android.DefaultAndroidInput$SensorListener r3 = new com.badlogic.gdx.backends.android.DefaultAndroidInput$SensorListener
            r3.<init>(r7)
            r7.gyroscopeListener = r3
            android.hardware.SensorManager r4 = r7.manager
            com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r5 = r7.config
            int r5 = r5.sensorDelay
            boolean r0 = r4.registerListener(r3, r0, r5)
            r7.gyroscopeAvailable = r0
            goto L83
        L81:
            r7.gyroscopeAvailable = r2
        L83:
            r7.rotationVectorAvailable = r2
            com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r0 = r7.config
            boolean r0 = r0.useRotationVectorSensor
            if (r0 == 0) goto Lf7
            android.hardware.SensorManager r0 = r7.manager
            if (r0 != 0) goto L99
            android.content.Context r0 = r7.context
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0
            r7.manager = r0
        L99:
            android.hardware.SensorManager r0 = r7.manager
            r3 = 11
            java.util.List r0 = r0.getSensorList(r3)
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto Lf7
            com.badlogic.gdx.backends.android.DefaultAndroidInput$SensorListener r3 = new com.badlogic.gdx.backends.android.DefaultAndroidInput$SensorListener
            r3.<init>(r7)
            r7.rotationVectorListener = r3
            java.util.Iterator r3 = r0.iterator()
        Lb2:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Ldf
            java.lang.Object r4 = r3.next()
            android.hardware.Sensor r4 = (android.hardware.Sensor) r4
            java.lang.String r5 = r4.getVendor()
            java.lang.String r6 = "Google Inc."
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Lb2
            int r5 = r4.getVersion()
            r6 = 3
            if (r5 != r6) goto Lb2
            android.hardware.SensorManager r3 = r7.manager
            android.hardware.SensorEventListener r5 = r7.rotationVectorListener
            com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r6 = r7.config
            int r6 = r6.sensorDelay
            boolean r3 = r3.registerListener(r5, r4, r6)
            r7.rotationVectorAvailable = r3
        Ldf:
            boolean r3 = r7.rotationVectorAvailable
            if (r3 != 0) goto Lf7
            android.hardware.SensorManager r3 = r7.manager
            android.hardware.SensorEventListener r4 = r7.rotationVectorListener
            java.lang.Object r0 = r0.get(r2)
            android.hardware.Sensor r0 = (android.hardware.Sensor) r0
            com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r5 = r7.config
            int r5 = r5.sensorDelay
            boolean r0 = r3.registerListener(r4, r0, r5)
            r7.rotationVectorAvailable = r0
        Lf7:
            com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r0 = r7.config
            boolean r0 = r0.useCompass
            if (r0 == 0) goto L135
            boolean r0 = r7.rotationVectorAvailable
            if (r0 != 0) goto L135
            android.hardware.SensorManager r0 = r7.manager
            if (r0 != 0) goto L10f
            android.content.Context r0 = r7.context
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0
            r7.manager = r0
        L10f:
            android.hardware.SensorManager r0 = r7.manager
            r1 = 2
            android.hardware.Sensor r0 = r0.getDefaultSensor(r1)
            if (r0 == 0) goto L132
            boolean r1 = r7.accelerometerAvailable
            r7.compassAvailable = r1
            if (r1 == 0) goto L137
            com.badlogic.gdx.backends.android.DefaultAndroidInput$SensorListener r1 = new com.badlogic.gdx.backends.android.DefaultAndroidInput$SensorListener
            r1.<init>(r7)
            r7.compassListener = r1
            android.hardware.SensorManager r2 = r7.manager
            com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r3 = r7.config
            int r3 = r3.sensorDelay
            boolean r0 = r2.registerListener(r1, r0, r3)
            r7.compassAvailable = r0
            goto L137
        L132:
            r7.compassAvailable = r2
            goto L137
        L135:
            r7.compassAvailable = r2
        L137:
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.String r1 = "AndroidInput"
            java.lang.String r2 = "sensor listener setup"
            r0.log(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public void setCursorCatched(boolean r1) {
            r0 = this;
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public void setCursorPosition(int r1, int r2) {
            r0 = this;
            return
    }

    @Override // com.badlogic.gdx.Input
    public void setInputProcessor(com.badlogic.gdx.InputProcessor r1) {
            r0 = this;
            monitor-enter(r0)
            r0.processor = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
            throw r1
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public void setKeyboardAvailable(boolean r1) {
            r0 = this;
            r0.keyboardAvailable = r1
            return
    }

    @Override // com.badlogic.gdx.Input
    public void setOnscreenKeyboardVisible(boolean r2) {
            r1 = this;
            com.badlogic.gdx.Input$OnscreenKeyboardType r0 = com.badlogic.gdx.Input.OnscreenKeyboardType.Default
            r1.setOnscreenKeyboardVisible(r2, r0)
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public void setOnscreenKeyboardVisible(boolean r3, com.badlogic.gdx.Input.OnscreenKeyboardType r4) {
            r2 = this;
            android.os.Handler r0 = r2.handle
            com.badlogic.gdx.backends.android.DefaultAndroidInput$4 r1 = new com.badlogic.gdx.backends.android.DefaultAndroidInput$4
            r1.<init>(r2, r3, r4)
            r0.post(r1)
            return
    }

    void unregisterSensorListeners() {
            r3 = this;
            android.hardware.SensorManager r0 = r3.manager
            if (r0 == 0) goto L31
            android.hardware.SensorEventListener r1 = r3.accelerometerListener
            r2 = 0
            if (r1 == 0) goto Le
            r0.unregisterListener(r1)
            r3.accelerometerListener = r2
        Le:
            android.hardware.SensorEventListener r0 = r3.gyroscopeListener
            if (r0 == 0) goto L19
            android.hardware.SensorManager r1 = r3.manager
            r1.unregisterListener(r0)
            r3.gyroscopeListener = r2
        L19:
            android.hardware.SensorEventListener r0 = r3.rotationVectorListener
            if (r0 == 0) goto L24
            android.hardware.SensorManager r1 = r3.manager
            r1.unregisterListener(r0)
            r3.rotationVectorListener = r2
        L24:
            android.hardware.SensorEventListener r0 = r3.compassListener
            if (r0 == 0) goto L2f
            android.hardware.SensorManager r1 = r3.manager
            r1.unregisterListener(r0)
            r3.compassListener = r2
        L2f:
            r3.manager = r2
        L31:
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            java.lang.String r1 = "AndroidInput"
            java.lang.String r2 = "sensor listener tear down"
            r0.log(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public void vibrate(int r2) {
            r1 = this;
            com.badlogic.gdx.backends.android.AndroidHaptics r0 = r1.haptics
            r0.vibrate(r2)
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public void vibrate(int r2, int r3, boolean r4) {
            r1 = this;
            com.badlogic.gdx.backends.android.AndroidHaptics r0 = r1.haptics
            r0.vibrate(r2, r3, r4)
            return
    }

    @Override // com.badlogic.gdx.Input
    public void vibrate(int r1, boolean r2) {
            r0 = this;
            com.badlogic.gdx.backends.android.AndroidHaptics r2 = r0.haptics
            r2.vibrate(r1)
            return
    }

    @Override // com.badlogic.gdx.backends.android.AndroidInput
    public void vibrate(com.badlogic.gdx.Input.VibrationType r2) {
            r1 = this;
            com.badlogic.gdx.backends.android.AndroidHaptics r0 = r1.haptics
            r0.vibrate(r2)
            return
    }
}
