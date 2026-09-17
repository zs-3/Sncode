package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzsl implements com.google.android.gms.internal.ads.zzsr {
    private final android.content.Context zza;

    @java.lang.Deprecated
    public zzsl() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            return
    }

    public zzsl(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzsr
    public final com.google.android.gms.internal.ads.zzst zzd(com.google.android.gms.internal.ads.zzsq r7) throws java.io.IOException {
            r6 = this;
            int r0 = com.google.android.gms.internal.ads.zzeu.zza
            r1 = 23
            if (r0 < r1) goto L45
            r1 = 31
            if (r0 < r1) goto Lb
            goto L20
        Lb:
            android.content.Context r1 = r6.zza
            if (r1 == 0) goto L45
            r2 = 28
            if (r0 < r2) goto L45
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "com.amazon.hardware.tv_screen"
            boolean r1 = r1.hasSystemFeature(r2)
            if (r1 != 0) goto L20
            goto L45
        L20:
            com.google.android.gms.internal.ads.zzaf r0 = r7.zzc
            java.lang.String r0 = r0.zzn
            int r0 = com.google.android.gms.internal.ads.zzbn.zzb(r0)
            java.lang.String r1 = com.google.android.gms.internal.ads.zzeu.zzC(r0)
            java.lang.String r2 = "Creating an asynchronous MediaCodec adapter for track type "
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r2 = "DMCodecAdapterFactory"
            com.google.android.gms.internal.ads.zzea.zze(r2, r1)
            com.google.android.gms.internal.ads.zzsb r1 = new com.google.android.gms.internal.ads.zzsb
            r1.<init>(r0)
            r0 = 1
            r1.zze(r0)
            com.google.android.gms.internal.ads.zzsd r7 = r1.zzc(r7)
            return r7
        L45:
            r1 = 0
            com.google.android.gms.internal.ads.zzsw r2 = r7.zza     // Catch: java.lang.RuntimeException -> L90 java.io.IOException -> L92
            java.lang.String r2 = r2.zza     // Catch: java.lang.RuntimeException -> L90 java.io.IOException -> L92
            java.lang.String r3 = "createCodec:"
            java.lang.String r3 = r3.concat(r2)     // Catch: java.lang.RuntimeException -> L90 java.io.IOException -> L92
            android.os.Trace.beginSection(r3)     // Catch: java.lang.RuntimeException -> L90 java.io.IOException -> L92
            android.media.MediaCodec r2 = android.media.MediaCodec.createByCodecName(r2)     // Catch: java.lang.RuntimeException -> L90 java.io.IOException -> L92
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L90 java.io.IOException -> L92
            java.lang.String r3 = "configureCodec"
            android.os.Trace.beginSection(r3)     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d
            android.view.Surface r3 = r7.zzd     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d
            r4 = 0
            if (r3 != 0) goto L70
            com.google.android.gms.internal.ads.zzsw r5 = r7.zza     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d
            boolean r5 = r5.zzh     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d
            if (r5 == 0) goto L70
            r5 = 35
            if (r0 < r5) goto L70
            r4 = 8
        L70:
            android.media.MediaFormat r0 = r7.zzb     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d
            r2.configure(r0, r3, r1, r4)     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d
            java.lang.String r0 = "startCodec"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d
            r2.start()     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d
            com.google.android.gms.internal.ads.zztu r0 = new com.google.android.gms.internal.ads.zztu     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d
            com.google.android.gms.internal.ads.zzsp r7 = r7.zzf     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d
            r0.<init>(r2, r7, r1)     // Catch: java.lang.RuntimeException -> L8b java.io.IOException -> L8d
            return r0
        L8b:
            r7 = move-exception
            goto L8e
        L8d:
            r7 = move-exception
        L8e:
            r1 = r2
            goto L93
        L90:
            r7 = move-exception
            goto L93
        L92:
            r7 = move-exception
        L93:
            if (r1 == 0) goto L98
            r1.release()
        L98:
            throw r7
    }
}
