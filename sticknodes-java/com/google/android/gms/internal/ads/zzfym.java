package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfym {
    private final com.google.android.gms.internal.ads.zzfyl zza;

    private zzfym(com.google.android.gms.internal.ads.zzfyl r2) {
            r1 = this;
            int r0 = com.google.android.gms.internal.ads.zzfxm.zzb
            r1.<init>()
            r1.zza = r2
            return
    }

    public static com.google.android.gms.internal.ads.zzfym zza(int r2) {
            com.google.android.gms.internal.ads.zzfym r2 = new com.google.android.gms.internal.ads.zzfym
            com.google.android.gms.internal.ads.zzfyi r0 = new com.google.android.gms.internal.ads.zzfyi
            r1 = 4000(0xfa0, float:5.605E-42)
            r0.<init>(r1)
            r2.<init>(r0)
            return r2
    }

    public static com.google.android.gms.internal.ads.zzfym zzb(com.google.android.gms.internal.ads.zzfxn r2) {
            com.google.android.gms.internal.ads.zzfym r0 = new com.google.android.gms.internal.ads.zzfym
            com.google.android.gms.internal.ads.zzfyg r1 = new com.google.android.gms.internal.ads.zzfyg
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Iterator zzd(com.google.android.gms.internal.ads.zzfym r0, java.lang.CharSequence r1) {
            java.util.Iterator r0 = r0.zzf(r1)
            return r0
    }

    private final java.util.Iterator zzf(java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfyl r0 = r1.zza
            java.util.Iterator r2 = r0.zza(r1, r2)
            return r2
    }

    public final java.lang.Iterable zzc(java.lang.CharSequence r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            com.google.android.gms.internal.ads.zzfyj r0 = new com.google.android.gms.internal.ads.zzfyj
            r0.<init>(r1, r2)
            return r0
    }

    public final java.util.List zze(java.lang.CharSequence r3) {
            r2 = this;
            java.util.Objects.requireNonNull(r3)
            java.util.Iterator r3 = r2.zzf(r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lc:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            goto Lc
        L1c:
            java.util.List r3 = java.util.Collections.unmodifiableList(r0)
            return r3
    }
}
