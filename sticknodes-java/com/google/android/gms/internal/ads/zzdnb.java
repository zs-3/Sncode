package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdnb {
    private final com.google.android.gms.ads.internal.util.zzbo zza;
    private final com.google.android.gms.common.util.Clock zzb;
    private final java.util.concurrent.Executor zzc;

    public zzdnb(com.google.android.gms.ads.internal.util.zzbo r1, com.google.android.gms.common.util.Clock r2, java.util.concurrent.Executor r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    private final android.graphics.Bitmap zzc(byte[] r8, android.graphics.BitmapFactory.Options r9) {
            r7 = this;
            com.google.android.gms.common.util.Clock r0 = r7.zzb
            long r0 = r0.elapsedRealtime()
            int r2 = r8.length
            r3 = 0
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeByteArray(r8, r3, r2, r9)
            com.google.android.gms.common.util.Clock r9 = r7.zzb
            long r4 = r9.elapsedRealtime()
            if (r8 == 0) goto L64
            long r4 = r4 - r0
            int r9 = r8.getWidth()
            int r0 = r8.getHeight()
            int r1 = r8.getAllocationByteCount()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            java.lang.Thread r2 = r2.getThread()
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            if (r2 != r6) goto L30
            r3 = 1
        L30:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "Decoded image w: "
            r2.append(r6)
            r2.append(r9)
            java.lang.String r9 = " h:"
            r2.append(r9)
            r2.append(r0)
            java.lang.String r9 = " bytes: "
            r2.append(r9)
            r2.append(r1)
            java.lang.String r9 = " time: "
            r2.append(r9)
            r2.append(r4)
            java.lang.String r9 = " on ui thread: "
            r2.append(r9)
            r2.append(r3)
            java.lang.String r9 = r2.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r9)
        L64:
            return r8
    }

    final /* synthetic */ android.graphics.Bitmap zza(double r4, boolean r6, com.google.android.gms.internal.ads.zzapy r7) {
            r3 = this;
            byte[] r7 = r7.zzb
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 4639833516098453504(0x4064000000000000, double:160.0)
            double r4 = r4 * r1
            int r4 = (int) r4
            r0.inDensity = r4
            if (r6 != 0) goto L14
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.RGB_565
            r0.inPreferredConfig = r4
        L14:
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzfU
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L55
            r4 = 1
            r0.inJustDecodeBounds = r4
            r3.zzc(r7, r0)
            r5 = 0
            r0.inJustDecodeBounds = r5
            int r5 = r0.outWidth
            int r6 = r0.outHeight
            int r5 = r5 * r6
            if (r5 <= 0) goto L55
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzfV
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r1.zza(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r5 = r5 + (-1)
            int r5 = r5 / r6
            int r5 = java.lang.Integer.numberOfLeadingZeros(r5)
            int r5 = 33 - r5
            int r5 = r5 / 2
            int r4 = r4 << r5
            r0.inSampleSize = r4
        L55:
            android.graphics.Bitmap r4 = r3.zzc(r7, r0)
            return r4
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(java.lang.String r2, double r3, boolean r5) {
            r1 = this;
            com.google.android.gms.ads.internal.util.zzbo r0 = r1.zza
            com.google.common.util.concurrent.ListenableFuture r2 = r0.zza(r2)
            com.google.android.gms.internal.ads.zzdna r0 = new com.google.android.gms.internal.ads.zzdna
            r0.<init>(r1, r3, r5)
            java.util.concurrent.Executor r3 = r1.zzc
            com.google.common.util.concurrent.ListenableFuture r2 = com.google.android.gms.internal.ads.zzgfo.zzm(r2, r0, r3)
            return r2
    }
}
