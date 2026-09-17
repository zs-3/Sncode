package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcgb {
    public zzcgb() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final com.google.android.gms.internal.ads.zzcfo zza(android.content.Context r18, com.google.android.gms.internal.ads.zzchi r19, java.lang.String r20, boolean r21, boolean r22, com.google.android.gms.internal.ads.zzavn r23, com.google.android.gms.internal.ads.zzbdy r24, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r25, com.google.android.gms.internal.ads.zzbdk r26, com.google.android.gms.ads.internal.zzm r27, com.google.android.gms.ads.internal.zza r28, com.google.android.gms.internal.ads.zzbbu r29, com.google.android.gms.internal.ads.zzfgh r30, com.google.android.gms.internal.ads.zzfgk r31, com.google.android.gms.internal.ads.zzefj r32, com.google.android.gms.internal.ads.zzfhg r33) throws com.google.android.gms.internal.ads.zzcga {
            com.google.android.gms.internal.ads.zzbcv.zza(r18)
            com.google.android.gms.internal.ads.zzcfx r0 = new com.google.android.gms.internal.ads.zzcfx     // Catch: java.lang.Throwable -> L4f
            r10 = 0
            r1 = r0
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r31
            r16 = r33
            r17 = r32
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L4f
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.getThreadPolicy()     // Catch: java.lang.Throwable -> L4f
            android.os.StrictMode$ThreadPolicy$Builder r2 = new android.os.StrictMode$ThreadPolicy$Builder     // Catch: java.lang.Throwable -> L4a
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L4a
            android.os.StrictMode$ThreadPolicy$Builder r2 = r2.permitDiskReads()     // Catch: java.lang.Throwable -> L4a
            android.os.StrictMode$ThreadPolicy$Builder r2 = r2.permitDiskWrites()     // Catch: java.lang.Throwable -> L4a
            android.os.StrictMode$ThreadPolicy r2 = r2.build()     // Catch: java.lang.Throwable -> L4a
            android.os.StrictMode.setThreadPolicy(r2)     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r0 = r0.zza()     // Catch: java.lang.Throwable -> L4a
            android.os.StrictMode.setThreadPolicy(r1)     // Catch: java.lang.Throwable -> L4f
            com.google.android.gms.internal.ads.zzcfo r0 = (com.google.android.gms.internal.ads.zzcfo) r0     // Catch: java.lang.Throwable -> L4f
            return r0
        L4a:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)     // Catch: java.lang.Throwable -> L4f
            throw r0     // Catch: java.lang.Throwable -> L4f
        L4f:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzcga r1 = new com.google.android.gms.internal.ads.zzcga
            java.lang.String r2 = "Webview initialization failed."
            r1.<init>(r2, r0)
            throw r1
    }
}
