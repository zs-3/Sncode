package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzdd {
    private static final java.lang.String zza = null;
    private static final java.lang.String zzb = null;
    private static final java.lang.String zzc = null;
    private static final java.lang.String zzd = null;
    private static final java.lang.String zze = null;

    static {
            r0 = 0
            r1 = 36
            java.lang.String r0 = java.lang.Integer.toString(r0, r1)
            com.google.android.gms.internal.ads.zzdd.zza = r0
            r0 = 1
            java.lang.String r0 = java.lang.Integer.toString(r0, r1)
            com.google.android.gms.internal.ads.zzdd.zzb = r0
            r0 = 2
            java.lang.String r0 = java.lang.Integer.toString(r0, r1)
            com.google.android.gms.internal.ads.zzdd.zzc = r0
            r0 = 3
            java.lang.String r0 = java.lang.Integer.toString(r0, r1)
            com.google.android.gms.internal.ads.zzdd.zzd = r0
            r0 = 4
            java.lang.String r0 = java.lang.Integer.toString(r0, r1)
            com.google.android.gms.internal.ads.zzdd.zze = r0
            return
    }

    public static java.util.ArrayList zza(android.text.Spanned r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r8.length()
            java.lang.Class<com.google.android.gms.internal.ads.zzdf> r2 = com.google.android.gms.internal.ads.zzdf.class
            r3 = 0
            java.lang.Object[] r1 = r8.getSpans(r3, r1, r2)
            com.google.android.gms.internal.ads.zzdf[] r1 = (com.google.android.gms.internal.ads.zzdf[]) r1
            int r2 = r1.length
            r4 = 0
        L14:
            if (r4 >= r2) goto L27
            r5 = r1[r4]
            android.os.Bundle r6 = r5.zza()
            r7 = 1
            android.os.Bundle r5 = zzb(r8, r5, r7, r6)
            r0.add(r5)
            int r4 = r4 + 1
            goto L14
        L27:
            int r1 = r8.length()
            java.lang.Class<com.google.android.gms.internal.ads.zzdh> r2 = com.google.android.gms.internal.ads.zzdh.class
            java.lang.Object[] r1 = r8.getSpans(r3, r1, r2)
            com.google.android.gms.internal.ads.zzdh[] r1 = (com.google.android.gms.internal.ads.zzdh[]) r1
            int r2 = r1.length
            r4 = 0
        L35:
            if (r4 >= r2) goto L48
            r5 = 2
            r6 = r1[r4]
            android.os.Bundle r7 = r6.zza()
            android.os.Bundle r5 = zzb(r8, r6, r5, r7)
            r0.add(r5)
            int r4 = r4 + 1
            goto L35
        L48:
            int r1 = r8.length()
            java.lang.Class<com.google.android.gms.internal.ads.zzde> r2 = com.google.android.gms.internal.ads.zzde.class
            java.lang.Object[] r1 = r8.getSpans(r3, r1, r2)
            com.google.android.gms.internal.ads.zzde[] r1 = (com.google.android.gms.internal.ads.zzde[]) r1
            int r2 = r1.length
        L55:
            if (r3 >= r2) goto L65
            r4 = r1[r3]
            r5 = 3
            r6 = 0
            android.os.Bundle r4 = zzb(r8, r4, r5, r6)
            r0.add(r4)
            int r3 = r3 + 1
            goto L55
        L65:
            return r0
    }

    private static android.os.Bundle zzb(android.text.Spanned r3, java.lang.Object r4, int r5, android.os.Bundle r6) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = com.google.android.gms.internal.ads.zzdd.zza
            int r2 = r3.getSpanStart(r4)
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.gms.internal.ads.zzdd.zzb
            int r2 = r3.getSpanEnd(r4)
            r0.putInt(r1, r2)
            java.lang.String r1 = com.google.android.gms.internal.ads.zzdd.zzc
            int r3 = r3.getSpanFlags(r4)
            r0.putInt(r1, r3)
            java.lang.String r3 = com.google.android.gms.internal.ads.zzdd.zzd
            r0.putInt(r3, r5)
            if (r6 == 0) goto L2c
            java.lang.String r3 = com.google.android.gms.internal.ads.zzdd.zze
            r0.putBundle(r3, r6)
        L2c:
            return r0
    }
}
