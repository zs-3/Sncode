package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public class AndroidHaptics {
    private android.media.AudioAttributes audioAttributes;
    private boolean hapticsSupport;
    private final android.os.Vibrator vibrator;
    private boolean vibratorSupport;

    /* renamed from: com.badlogic.gdx.backends.android.AndroidHaptics$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$badlogic$gdx$Input$VibrationType = null;

        static {
                com.badlogic.gdx.Input$VibrationType[] r0 = com.badlogic.gdx.Input.VibrationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.badlogic.gdx.backends.android.AndroidHaptics.AnonymousClass1.$SwitchMap$com$badlogic$gdx$Input$VibrationType = r0
                com.badlogic.gdx.Input$VibrationType r1 = com.badlogic.gdx.Input.VibrationType.LIGHT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.badlogic.gdx.backends.android.AndroidHaptics.AnonymousClass1.$SwitchMap$com$badlogic$gdx$Input$VibrationType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.badlogic.gdx.Input$VibrationType r1 = com.badlogic.gdx.Input.VibrationType.MEDIUM     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.badlogic.gdx.backends.android.AndroidHaptics.AnonymousClass1.$SwitchMap$com$badlogic$gdx$Input$VibrationType     // Catch: java.lang.NoSuchFieldError -> L28
                com.badlogic.gdx.Input$VibrationType r1 = com.badlogic.gdx.Input.VibrationType.HEAVY     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public AndroidHaptics(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.vibratorSupport = r0
            r3.hapticsSupport = r0
            java.lang.String r0 = "vibrator"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.os.Vibrator r4 = (android.os.Vibrator) r4
            r3.vibrator = r4
            if (r4 == 0) goto L41
            boolean r0 = r4.hasVibrator()
            if (r0 == 0) goto L41
            r0 = 1
            r3.vibratorSupport = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L41
            boolean r4 = r4.hasAmplitudeControl()
            if (r4 == 0) goto L2b
            r3.hapticsSupport = r0
        L2b:
            android.media.AudioAttributes$Builder r4 = new android.media.AudioAttributes$Builder
            r4.<init>()
            r0 = 4
            android.media.AudioAttributes$Builder r4 = r4.setContentType(r0)
            r0 = 14
            android.media.AudioAttributes$Builder r4 = r4.setUsage(r0)
            android.media.AudioAttributes r4 = r4.build()
            r3.audioAttributes = r4
        L41:
            return
    }

    public boolean hasHapticsSupport() {
            r1 = this;
            boolean r0 = r1.hapticsSupport
            return r0
    }

    public boolean hasVibratorAvailable() {
            r1 = this;
            boolean r0 = r1.vibratorSupport
            return r0
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    public void vibrate(int r4) {
            r3 = this;
            boolean r0 = r3.vibratorSupport
            if (r0 == 0) goto L1c
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L16
            android.os.Vibrator r0 = r3.vibrator
            long r1 = (long) r4
            r4 = -1
            android.os.VibrationEffect r4 = android.os.VibrationEffect.createOneShot(r1, r4)
            r0.vibrate(r4)
            goto L1c
        L16:
            android.os.Vibrator r0 = r3.vibrator
            long r1 = (long) r4
            r0.vibrate(r1)
        L1c:
            return
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    public void vibrate(int r3, int r4, boolean r5) {
            r2 = this;
            boolean r0 = r2.hapticsSupport
            if (r0 == 0) goto L1c
            r5 = 0
            r0 = 255(0xff, float:3.57E-43)
            int r4 = com.badlogic.gdx.math.MathUtils.clamp(r4, r5, r0)
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r5 < r0) goto L21
            android.os.Vibrator r5 = r2.vibrator
            long r0 = (long) r3
            android.os.VibrationEffect r3 = android.os.VibrationEffect.createOneShot(r0, r4)
            r5.vibrate(r3)
            goto L21
        L1c:
            if (r5 == 0) goto L21
            r2.vibrate(r3)
        L21:
            return
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    public void vibrate(com.badlogic.gdx.Input.VibrationType r4) {
            r3 = this;
            boolean r0 = r3.hapticsSupport
            if (r0 == 0) goto L40
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L40
            int[] r0 = com.badlogic.gdx.backends.android.AndroidHaptics.AnonymousClass1.$SwitchMap$com$badlogic$gdx$Input$VibrationType
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 2
            if (r0 == r1) goto L35
            if (r0 == r2) goto L34
            r1 = 3
            if (r0 != r1) goto L1d
            r2 = 5
            goto L35
        L1d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown VibrationType "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L34:
            r2 = 0
        L35:
            android.os.Vibrator r4 = r3.vibrator
            android.os.VibrationEffect r0 = android.os.VibrationEffect.createPredefined(r2)
            android.media.AudioAttributes r1 = r3.audioAttributes
            r4.vibrate(r0, r1)
        L40:
            return
    }
}
