package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class zzdhc {
    private final com.google.android.gms.internal.ads.zzdik zza;
    private final com.google.android.gms.internal.ads.zzcfo zzb;

    public zzdhc(com.google.android.gms.internal.ads.zzdik r1, com.google.android.gms.internal.ads.zzcfo r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final android.view.View zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzb
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.webkit.WebView r0 = r0.zzG()
            return r0
    }

    public final android.view.View zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzb
            if (r0 == 0) goto L9
            android.webkit.WebView r0 = r0.zzG()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final com.google.android.gms.internal.ads.zzcfo zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzb
            return r0
    }

    public final com.google.android.gms.internal.ads.zzdfs zzd(java.util.concurrent.Executor r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzdfs r0 = new com.google.android.gms.internal.ads.zzdfs
            com.google.android.gms.internal.ads.zzdhb r1 = new com.google.android.gms.internal.ads.zzdhb
            com.google.android.gms.internal.ads.zzcfo r2 = r3.zzb
            r1.<init>(r2)
            r0.<init>(r1, r4)
            return r0
    }

    public final com.google.android.gms.internal.ads.zzdik zze() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdik r0 = r1.zza
            return r0
    }

    public java.util.Set zzf(com.google.android.gms.internal.ads.zzcwx r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zzf
            com.google.android.gms.internal.ads.zzdfs r1 = new com.google.android.gms.internal.ads.zzdfs
            r1.<init>(r3, r0)
            java.util.Set r3 = java.util.Collections.singleton(r1)
            return r3
    }

    public java.util.Set zzg(com.google.android.gms.internal.ads.zzcwx r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzgfz r0 = com.google.android.gms.internal.ads.zzcan.zzf
            com.google.android.gms.internal.ads.zzdfs r1 = new com.google.android.gms.internal.ads.zzdfs
            r1.<init>(r3, r0)
            java.util.Set r3 = java.util.Collections.singleton(r1)
            return r3
    }
}
