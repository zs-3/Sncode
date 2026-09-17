package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzhch implements com.google.android.gms.internal.ads.zzhdl {
    private static final com.google.android.gms.internal.ads.zzhcn zza = null;
    private final com.google.android.gms.internal.ads.zzhcn zzb;

    static {
            com.google.android.gms.internal.ads.zzhcf r0 = new com.google.android.gms.internal.ads.zzhcf
            r0.<init>()
            com.google.android.gms.internal.ads.zzhch.zza = r0
            return
    }

    public zzhch() {
            r4 = this;
            com.google.android.gms.internal.ads.zzhcg r0 = new com.google.android.gms.internal.ads.zzhcg
            r1 = 2
            com.google.android.gms.internal.ads.zzhcn[] r1 = new com.google.android.gms.internal.ads.zzhcn[r1]
            com.google.android.gms.internal.ads.zzhax r2 = com.google.android.gms.internal.ads.zzhax.zza()
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.internal.ads.zzhcn r2 = com.google.android.gms.internal.ads.zzhch.zza
            int r3 = com.google.android.gms.internal.ads.zzhcz.zza
            r3 = 1
            r1[r3] = r2
            r0.<init>(r1)
            r4.<init>()
            byte[] r1 = com.google.android.gms.internal.ads.zzhbr.zzb
            r4.zzb = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhdl
    public final com.google.android.gms.internal.ads.zzhdk zza(java.lang.Class r9) {
            r8 = this;
            int r0 = com.google.android.gms.internal.ads.zzhdm.zza
            java.lang.Class<com.google.android.gms.internal.ads.zzhbe> r0 = com.google.android.gms.internal.ads.zzhbe.class
            boolean r0 = r0.isAssignableFrom(r9)
            if (r0 != 0) goto Lc
            int r0 = com.google.android.gms.internal.ads.zzhcz.zza
        Lc:
            com.google.android.gms.internal.ads.zzhcn r0 = r8.zzb
            com.google.android.gms.internal.ads.zzhcm r2 = r0.zzb(r9)
            boolean r0 = r2.zzb()
            if (r0 != 0) goto L40
            int r0 = com.google.android.gms.internal.ads.zzhcz.zza
            com.google.android.gms.internal.ads.zzhcv r3 = com.google.android.gms.internal.ads.zzhcw.zza()
            com.google.android.gms.internal.ads.zzhcc r4 = com.google.android.gms.internal.ads.zzhcd.zza()
            com.google.android.gms.internal.ads.zzhdy r5 = com.google.android.gms.internal.ads.zzhdm.zzm()
            int r0 = r2.zzc()
            int r0 = r0 + (-1)
            r1 = 1
            if (r0 == r1) goto L34
            com.google.android.gms.internal.ads.zzhap r0 = com.google.android.gms.internal.ads.zzhar.zza()
            goto L35
        L34:
            r0 = 0
        L35:
            r6 = r0
            com.google.android.gms.internal.ads.zzhck r7 = com.google.android.gms.internal.ads.zzhcl.zza()
            r1 = r9
            com.google.android.gms.internal.ads.zzhcs r9 = com.google.android.gms.internal.ads.zzhcs.zzm(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L40:
            int r9 = com.google.android.gms.internal.ads.zzhcz.zza
            com.google.android.gms.internal.ads.zzhdy r9 = com.google.android.gms.internal.ads.zzhdm.zzm()
            com.google.android.gms.internal.ads.zzhap r0 = com.google.android.gms.internal.ads.zzhar.zza()
            com.google.android.gms.internal.ads.zzhcp r1 = r2.zza()
            com.google.android.gms.internal.ads.zzhct r9 = com.google.android.gms.internal.ads.zzhct.zzc(r9, r0, r1)
            return r9
    }
}
