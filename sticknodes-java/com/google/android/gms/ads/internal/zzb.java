package com.google.android.gms.ads.internal;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzb {
    private final android.content.Context zza;
    private boolean zzb;
    private final com.google.android.gms.internal.ads.zzbyk zzc;
    private final com.google.android.gms.internal.ads.zzbvd zzd;

    public zzb(android.content.Context r1, com.google.android.gms.internal.ads.zzbyk r2, com.google.android.gms.internal.ads.zzbvd r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzc = r2
            com.google.android.gms.internal.ads.zzbvd r1 = new com.google.android.gms.internal.ads.zzbvd
            java.util.List r2 = java.util.Collections.emptyList()
            r3 = 0
            r1.<init>(r3, r2)
            r0.zzd = r1
            return
    }

    private final boolean zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbyk r0 = r1.zzc
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.ads.zzbyh r0 = r0.zza()
            boolean r0 = r0.zzf
            if (r0 != 0) goto L12
        Lc:
            com.google.android.gms.internal.ads.zzbvd r0 = r1.zzd
            boolean r0 = r0.zza
            if (r0 == 0) goto L14
        L12:
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    public final void zza() {
            r1 = this;
            r0 = 1
            r1.zzb = r0
            return
    }

    public final void zzb(java.lang.String r6) {
            r5 = this;
            boolean r0 = r5.zzd()
            if (r0 != 0) goto L7
            goto L49
        L7:
            java.lang.String r0 = ""
            if (r6 != 0) goto Lc
            r6 = r0
        Lc:
            com.google.android.gms.internal.ads.zzbyk r1 = r5.zzc
            if (r1 == 0) goto L16
            r0 = 0
            r2 = 3
            r1.zzd(r6, r0, r2)
            return
        L16:
            com.google.android.gms.internal.ads.zzbvd r1 = r5.zzd
            boolean r2 = r1.zza
            if (r2 == 0) goto L49
            java.util.List r1 = r1.zzb
            if (r1 == 0) goto L49
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L24
            java.lang.String r3 = android.net.Uri.encode(r6)
            java.lang.String r4 = "{NAVIGATION_URL}"
            java.lang.String r2 = r2.replace(r4, r3)
            android.content.Context r3 = r5.zza
            com.google.android.gms.ads.internal.zzu.zzp()
            com.google.android.gms.ads.internal.util.zzt.zzL(r3, r0, r2)
            goto L24
        L49:
            return
    }

    public final boolean zzc() {
            r1 = this;
            boolean r0 = r1.zzd()
            if (r0 == 0) goto Ld
            boolean r0 = r1.zzb
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }
}
