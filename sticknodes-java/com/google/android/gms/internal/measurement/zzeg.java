package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.4.0 */
/* loaded from: classes2.dex */
final class zzeg implements java.util.concurrent.ThreadFactory {
    private final java.util.concurrent.ThreadFactory zza;

    zzeg(com.google.android.gms.internal.measurement.zzff r1) {
            r0 = this;
            r0.<init>()
            java.util.concurrent.ThreadFactory r1 = java.util.concurrent.Executors.defaultThreadFactory()
            r0.zza = r1
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ThreadFactory r0 = r1.zza
            java.lang.Thread r2 = r0.newThread(r2)
            java.lang.String r0 = "ScionFrontendApi"
            r2.setName(r0)
            return r2
    }
}
