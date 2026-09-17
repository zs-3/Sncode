package kotlinx.coroutines.internal;

/* compiled from: FastServiceLoader.kt */
/* loaded from: classes2.dex */
public final class FastServiceLoaderKt {
    private static final boolean ANDROID_DETECTED = false;

    static {
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = "android.os.Build"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r0 = kotlin.Result.m72constructorimpl(r0)     // Catch: java.lang.Throwable -> Ld
            goto L18
        Ld:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m72constructorimpl(r0)
        L18:
            boolean r0 = kotlin.Result.m75isSuccessimpl(r0)
            kotlinx.coroutines.internal.FastServiceLoaderKt.ANDROID_DETECTED = r0
            return
    }

    public static final boolean getANDROID_DETECTED() {
            boolean r0 = kotlinx.coroutines.internal.FastServiceLoaderKt.ANDROID_DETECTED
            return r0
    }
}
