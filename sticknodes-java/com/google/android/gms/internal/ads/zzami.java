package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzami {
    public final java.lang.String zza;
    public final int zzb;
    public final java.lang.String zzc;
    public final java.util.Set zzd;

    private zzami(java.lang.String r1, int r2, java.lang.String r3, java.util.Set r4) {
            r0 = this;
            r0.<init>()
            r0.zzb = r2
            r0.zza = r1
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public static com.google.android.gms.internal.ads.zzami zza(java.lang.String r5, int r6) {
            java.lang.String r5 = r5.trim()
            boolean r0 = r5.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            java.lang.String r0 = " "
            int r0 = r5.indexOf(r0)
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L1a
            java.lang.String r0 = ""
            goto L27
        L1a:
            java.lang.String r4 = r5.substring(r0)
            java.lang.String r4 = r4.trim()
            java.lang.String r5 = r5.substring(r2, r0)
            r0 = r4
        L27:
            int r4 = com.google.android.gms.internal.ads.zzeu.zza
            java.lang.String r4 = "\\."
            java.lang.String[] r5 = r5.split(r4, r3)
            r2 = r5[r2]
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
        L36:
            int r4 = r5.length
            if (r1 >= r4) goto L41
            r4 = r5[r1]
            r3.add(r4)
            int r1 = r1 + 1
            goto L36
        L41:
            com.google.android.gms.internal.ads.zzami r5 = new com.google.android.gms.internal.ads.zzami
            r5.<init>(r2, r6, r0, r3)
            return r5
    }

    public static com.google.android.gms.internal.ads.zzami zzb() {
            com.google.android.gms.internal.ads.zzami r0 = new com.google.android.gms.internal.ads.zzami
            java.util.Set r1 = java.util.Collections.emptySet()
            java.lang.String r2 = ""
            r3 = 0
            r0.<init>(r2, r3, r2, r1)
            return r0
    }
}
