package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfng {
    private final android.content.Context zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.ads.internal.util.client.zzr zzc;
    private final com.google.android.gms.internal.ads.zzfmd zzd;

    zzfng(android.content.Context r1, java.util.concurrent.Executor r2, com.google.android.gms.ads.internal.util.client.zzr r3, com.google.android.gms.internal.ads.zzfmd r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    final /* synthetic */ void zza(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.ads.internal.util.client.zzr r0 = r1.zzc
            r0.zza(r2)
            return
    }

    final /* synthetic */ void zzb(java.lang.String r3, com.google.android.gms.internal.ads.zzfma r4) {
            r2 = this;
            android.content.Context r0 = r2.zza
            r1 = 14
            com.google.android.gms.internal.ads.zzflp r0 = com.google.android.gms.internal.ads.zzflo.zza(r0, r1)
            r0.zzi()
            com.google.android.gms.ads.internal.util.client.zzr r1 = r2.zzc
            boolean r3 = r1.zza(r3)
            r0.zzg(r3)
            if (r4 != 0) goto L20
            com.google.android.gms.internal.ads.zzfmd r3 = r2.zzd
            com.google.android.gms.internal.ads.zzflt r4 = r0.zzm()
            r3.zzb(r4)
            return
        L20:
            r4.zza(r0)
            r4.zzh()
            return
    }

    public final void zzc(java.lang.String r3, com.google.android.gms.internal.ads.zzfma r4) {
            r2 = this;
            boolean r0 = com.google.android.gms.internal.ads.zzfmd.zza()
            if (r0 == 0) goto L20
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbek.zzd
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L15
            goto L20
        L15:
            java.util.concurrent.Executor r0 = r2.zzb
            com.google.android.gms.internal.ads.zzfnf r1 = new com.google.android.gms.internal.ads.zzfnf
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
            return
        L20:
            java.util.concurrent.Executor r4 = r2.zzb
            com.google.android.gms.internal.ads.zzfne r0 = new com.google.android.gms.internal.ads.zzfne
            r0.<init>(r2, r3)
            r4.execute(r0)
            return
    }

    public final void zzd(java.util.List r3) {
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L15
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            r2.zzc(r0, r1)
            goto L4
        L15:
            return
    }
}
