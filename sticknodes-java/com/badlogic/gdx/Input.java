package com.badlogic.gdx;

/* loaded from: classes.dex */
public interface Input {

    public enum OnscreenKeyboardType extends java.lang.Enum<com.badlogic.gdx.Input.OnscreenKeyboardType> {
        private static final /* synthetic */ com.badlogic.gdx.Input.OnscreenKeyboardType[] $VALUES = null;
        public static final com.badlogic.gdx.Input.OnscreenKeyboardType Default = null;
        public static final com.badlogic.gdx.Input.OnscreenKeyboardType Email = null;
        public static final com.badlogic.gdx.Input.OnscreenKeyboardType NumberPad = null;
        public static final com.badlogic.gdx.Input.OnscreenKeyboardType Password = null;
        public static final com.badlogic.gdx.Input.OnscreenKeyboardType PhonePad = null;
        public static final com.badlogic.gdx.Input.OnscreenKeyboardType URI = null;

        static {
                com.badlogic.gdx.Input$OnscreenKeyboardType r0 = new com.badlogic.gdx.Input$OnscreenKeyboardType
                java.lang.String r1 = "Default"
                r2 = 0
                r0.<init>(r1, r2)
                com.badlogic.gdx.Input.OnscreenKeyboardType.Default = r0
                com.badlogic.gdx.Input$OnscreenKeyboardType r1 = new com.badlogic.gdx.Input$OnscreenKeyboardType
                java.lang.String r3 = "NumberPad"
                r4 = 1
                r1.<init>(r3, r4)
                com.badlogic.gdx.Input.OnscreenKeyboardType.NumberPad = r1
                com.badlogic.gdx.Input$OnscreenKeyboardType r3 = new com.badlogic.gdx.Input$OnscreenKeyboardType
                java.lang.String r5 = "PhonePad"
                r6 = 2
                r3.<init>(r5, r6)
                com.badlogic.gdx.Input.OnscreenKeyboardType.PhonePad = r3
                com.badlogic.gdx.Input$OnscreenKeyboardType r5 = new com.badlogic.gdx.Input$OnscreenKeyboardType
                java.lang.String r7 = "Email"
                r8 = 3
                r5.<init>(r7, r8)
                com.badlogic.gdx.Input.OnscreenKeyboardType.Email = r5
                com.badlogic.gdx.Input$OnscreenKeyboardType r7 = new com.badlogic.gdx.Input$OnscreenKeyboardType
                java.lang.String r9 = "Password"
                r10 = 4
                r7.<init>(r9, r10)
                com.badlogic.gdx.Input.OnscreenKeyboardType.Password = r7
                com.badlogic.gdx.Input$OnscreenKeyboardType r9 = new com.badlogic.gdx.Input$OnscreenKeyboardType
                java.lang.String r11 = "URI"
                r12 = 5
                r9.<init>(r11, r12)
                com.badlogic.gdx.Input.OnscreenKeyboardType.URI = r9
                r11 = 6
                com.badlogic.gdx.Input$OnscreenKeyboardType[] r11 = new com.badlogic.gdx.Input.OnscreenKeyboardType[r11]
                r11[r2] = r0
                r11[r4] = r1
                r11[r6] = r3
                r11[r8] = r5
                r11[r10] = r7
                r11[r12] = r9
                com.badlogic.gdx.Input.OnscreenKeyboardType.$VALUES = r11
                return
        }

        OnscreenKeyboardType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.badlogic.gdx.Input.OnscreenKeyboardType valueOf(java.lang.String r1) {
                java.lang.Class<com.badlogic.gdx.Input$OnscreenKeyboardType> r0 = com.badlogic.gdx.Input.OnscreenKeyboardType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.badlogic.gdx.Input$OnscreenKeyboardType r1 = (com.badlogic.gdx.Input.OnscreenKeyboardType) r1
                return r1
        }

        public static com.badlogic.gdx.Input.OnscreenKeyboardType[] values() {
                com.badlogic.gdx.Input$OnscreenKeyboardType[] r0 = com.badlogic.gdx.Input.OnscreenKeyboardType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.badlogic.gdx.Input$OnscreenKeyboardType[] r0 = (com.badlogic.gdx.Input.OnscreenKeyboardType[]) r0
                return r0
        }
    }

    public enum Orientation extends java.lang.Enum<com.badlogic.gdx.Input.Orientation> {
        private static final /* synthetic */ com.badlogic.gdx.Input.Orientation[] $VALUES = null;
        public static final com.badlogic.gdx.Input.Orientation Landscape = null;
        public static final com.badlogic.gdx.Input.Orientation Portrait = null;

        static {
                com.badlogic.gdx.Input$Orientation r0 = new com.badlogic.gdx.Input$Orientation
                java.lang.String r1 = "Landscape"
                r2 = 0
                r0.<init>(r1, r2)
                com.badlogic.gdx.Input.Orientation.Landscape = r0
                com.badlogic.gdx.Input$Orientation r1 = new com.badlogic.gdx.Input$Orientation
                java.lang.String r3 = "Portrait"
                r4 = 1
                r1.<init>(r3, r4)
                com.badlogic.gdx.Input.Orientation.Portrait = r1
                r3 = 2
                com.badlogic.gdx.Input$Orientation[] r3 = new com.badlogic.gdx.Input.Orientation[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.badlogic.gdx.Input.Orientation.$VALUES = r3
                return
        }

        Orientation(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.badlogic.gdx.Input.Orientation valueOf(java.lang.String r1) {
                java.lang.Class<com.badlogic.gdx.Input$Orientation> r0 = com.badlogic.gdx.Input.Orientation.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.badlogic.gdx.Input$Orientation r1 = (com.badlogic.gdx.Input.Orientation) r1
                return r1
        }

        public static com.badlogic.gdx.Input.Orientation[] values() {
                com.badlogic.gdx.Input$Orientation[] r0 = com.badlogic.gdx.Input.Orientation.$VALUES
                java.lang.Object r0 = r0.clone()
                com.badlogic.gdx.Input$Orientation[] r0 = (com.badlogic.gdx.Input.Orientation[]) r0
                return r0
        }
    }

    public enum Peripheral extends java.lang.Enum<com.badlogic.gdx.Input.Peripheral> {
        private static final /* synthetic */ com.badlogic.gdx.Input.Peripheral[] $VALUES = null;
        public static final com.badlogic.gdx.Input.Peripheral Accelerometer = null;
        public static final com.badlogic.gdx.Input.Peripheral Compass = null;
        public static final com.badlogic.gdx.Input.Peripheral Gyroscope = null;
        public static final com.badlogic.gdx.Input.Peripheral HapticFeedback = null;
        public static final com.badlogic.gdx.Input.Peripheral HardwareKeyboard = null;
        public static final com.badlogic.gdx.Input.Peripheral MultitouchScreen = null;
        public static final com.badlogic.gdx.Input.Peripheral OnscreenKeyboard = null;
        public static final com.badlogic.gdx.Input.Peripheral Pressure = null;
        public static final com.badlogic.gdx.Input.Peripheral RotationVector = null;
        public static final com.badlogic.gdx.Input.Peripheral Vibrator = null;

        static {
                com.badlogic.gdx.Input$Peripheral r0 = new com.badlogic.gdx.Input$Peripheral
                java.lang.String r1 = "HardwareKeyboard"
                r2 = 0
                r0.<init>(r1, r2)
                com.badlogic.gdx.Input.Peripheral.HardwareKeyboard = r0
                com.badlogic.gdx.Input$Peripheral r1 = new com.badlogic.gdx.Input$Peripheral
                java.lang.String r3 = "OnscreenKeyboard"
                r4 = 1
                r1.<init>(r3, r4)
                com.badlogic.gdx.Input.Peripheral.OnscreenKeyboard = r1
                com.badlogic.gdx.Input$Peripheral r3 = new com.badlogic.gdx.Input$Peripheral
                java.lang.String r5 = "MultitouchScreen"
                r6 = 2
                r3.<init>(r5, r6)
                com.badlogic.gdx.Input.Peripheral.MultitouchScreen = r3
                com.badlogic.gdx.Input$Peripheral r5 = new com.badlogic.gdx.Input$Peripheral
                java.lang.String r7 = "Accelerometer"
                r8 = 3
                r5.<init>(r7, r8)
                com.badlogic.gdx.Input.Peripheral.Accelerometer = r5
                com.badlogic.gdx.Input$Peripheral r7 = new com.badlogic.gdx.Input$Peripheral
                java.lang.String r9 = "Compass"
                r10 = 4
                r7.<init>(r9, r10)
                com.badlogic.gdx.Input.Peripheral.Compass = r7
                com.badlogic.gdx.Input$Peripheral r9 = new com.badlogic.gdx.Input$Peripheral
                java.lang.String r11 = "Vibrator"
                r12 = 5
                r9.<init>(r11, r12)
                com.badlogic.gdx.Input.Peripheral.Vibrator = r9
                com.badlogic.gdx.Input$Peripheral r11 = new com.badlogic.gdx.Input$Peripheral
                java.lang.String r13 = "HapticFeedback"
                r14 = 6
                r11.<init>(r13, r14)
                com.badlogic.gdx.Input.Peripheral.HapticFeedback = r11
                com.badlogic.gdx.Input$Peripheral r13 = new com.badlogic.gdx.Input$Peripheral
                java.lang.String r15 = "Gyroscope"
                r14 = 7
                r13.<init>(r15, r14)
                com.badlogic.gdx.Input.Peripheral.Gyroscope = r13
                com.badlogic.gdx.Input$Peripheral r15 = new com.badlogic.gdx.Input$Peripheral
                java.lang.String r14 = "RotationVector"
                r12 = 8
                r15.<init>(r14, r12)
                com.badlogic.gdx.Input.Peripheral.RotationVector = r15
                com.badlogic.gdx.Input$Peripheral r14 = new com.badlogic.gdx.Input$Peripheral
                java.lang.String r12 = "Pressure"
                r10 = 9
                r14.<init>(r12, r10)
                com.badlogic.gdx.Input.Peripheral.Pressure = r14
                r12 = 10
                com.badlogic.gdx.Input$Peripheral[] r12 = new com.badlogic.gdx.Input.Peripheral[r12]
                r12[r2] = r0
                r12[r4] = r1
                r12[r6] = r3
                r12[r8] = r5
                r0 = 4
                r12[r0] = r7
                r0 = 5
                r12[r0] = r9
                r0 = 6
                r12[r0] = r11
                r0 = 7
                r12[r0] = r13
                r0 = 8
                r12[r0] = r15
                r12[r10] = r14
                com.badlogic.gdx.Input.Peripheral.$VALUES = r12
                return
        }

        Peripheral(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.badlogic.gdx.Input.Peripheral valueOf(java.lang.String r1) {
                java.lang.Class<com.badlogic.gdx.Input$Peripheral> r0 = com.badlogic.gdx.Input.Peripheral.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.badlogic.gdx.Input$Peripheral r1 = (com.badlogic.gdx.Input.Peripheral) r1
                return r1
        }

        public static com.badlogic.gdx.Input.Peripheral[] values() {
                com.badlogic.gdx.Input$Peripheral[] r0 = com.badlogic.gdx.Input.Peripheral.$VALUES
                java.lang.Object r0 = r0.clone()
                com.badlogic.gdx.Input$Peripheral[] r0 = (com.badlogic.gdx.Input.Peripheral[]) r0
                return r0
        }
    }

    public interface TextInputListener {
        void canceled();

        void input(java.lang.String r1);
    }

    public enum VibrationType extends java.lang.Enum<com.badlogic.gdx.Input.VibrationType> {
        private static final /* synthetic */ com.badlogic.gdx.Input.VibrationType[] $VALUES = null;
        public static final com.badlogic.gdx.Input.VibrationType HEAVY = null;
        public static final com.badlogic.gdx.Input.VibrationType LIGHT = null;
        public static final com.badlogic.gdx.Input.VibrationType MEDIUM = null;

        static {
                com.badlogic.gdx.Input$VibrationType r0 = new com.badlogic.gdx.Input$VibrationType
                java.lang.String r1 = "LIGHT"
                r2 = 0
                r0.<init>(r1, r2)
                com.badlogic.gdx.Input.VibrationType.LIGHT = r0
                com.badlogic.gdx.Input$VibrationType r1 = new com.badlogic.gdx.Input$VibrationType
                java.lang.String r3 = "MEDIUM"
                r4 = 1
                r1.<init>(r3, r4)
                com.badlogic.gdx.Input.VibrationType.MEDIUM = r1
                com.badlogic.gdx.Input$VibrationType r3 = new com.badlogic.gdx.Input$VibrationType
                java.lang.String r5 = "HEAVY"
                r6 = 2
                r3.<init>(r5, r6)
                com.badlogic.gdx.Input.VibrationType.HEAVY = r3
                r5 = 3
                com.badlogic.gdx.Input$VibrationType[] r5 = new com.badlogic.gdx.Input.VibrationType[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.badlogic.gdx.Input.VibrationType.$VALUES = r5
                return
        }

        VibrationType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.badlogic.gdx.Input.VibrationType valueOf(java.lang.String r1) {
                java.lang.Class<com.badlogic.gdx.Input$VibrationType> r0 = com.badlogic.gdx.Input.VibrationType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.badlogic.gdx.Input$VibrationType r1 = (com.badlogic.gdx.Input.VibrationType) r1
                return r1
        }

        public static com.badlogic.gdx.Input.VibrationType[] values() {
                com.badlogic.gdx.Input$VibrationType[] r0 = com.badlogic.gdx.Input.VibrationType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.badlogic.gdx.Input$VibrationType[] r0 = (com.badlogic.gdx.Input.VibrationType[]) r0
                return r0
        }
    }

    long getCurrentEventTime();

    int getX();

    int getY();

    boolean isKeyJustPressed(int r1);

    boolean isKeyPressed(int r1);

    boolean isTouched();

    boolean isTouched(int r1);

    void setCatchKey(int r1, boolean r2);

    void setInputProcessor(com.badlogic.gdx.InputProcessor r1);

    void setOnscreenKeyboardVisible(boolean r1);

    void vibrate(int r1, boolean r2);
}
