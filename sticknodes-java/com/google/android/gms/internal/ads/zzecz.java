package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzecz extends com.google.android.gms.internal.ads.zzbvm {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzeza zzb;
    private final com.google.android.gms.internal.ads.zzeyy zzc;
    private final com.google.android.gms.internal.ads.zzedh zzd;
    private final com.google.android.gms.internal.ads.zzgfz zze;
    private final com.google.android.gms.internal.ads.zzbwi zzf;

    zzecz(android.content.Context r1, com.google.android.gms.internal.ads.zzeza r2, com.google.android.gms.internal.ads.zzeyy r3, com.google.android.gms.internal.ads.zzede r4, com.google.android.gms.internal.ads.zzedh r5, com.google.android.gms.internal.ads.zzgfz r6, com.google.android.gms.internal.ads.zzbwi r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r5
            r0.zze = r6
            r0.zzf = r7
            return
    }

    private final void zzc(com.google.common.util.concurrent.ListenableFuture r3, com.google.android.gms.internal.ads.zzbvq r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzgff r3 = com.google.android.gms.internal.ads.zzgff.zzu(r3)
            com.google.android.gms.internal.ads.zzecw r0 = new com.google.android.gms.internal.ads.zzecw
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzgfz r1 = com.google.android.gms.internal.ads.zzcan.zza
            com.google.common.util.concurrent.ListenableFuture r3 = com.google.android.gms.internal.ads.zzgfo.zzn(r3, r0, r1)
            com.google.android.gms.internal.ads.zzgff r3 = (com.google.android.gms.internal.ads.zzgff) r3
            com.google.android.gms.internal.ads.zzecy r0 = new com.google.android.gms.internal.ads.zzecy
            r0.<init>(r2, r4)
            com.google.android.gms.internal.ads.zzgfz r4 = com.google.android.gms.internal.ads.zzcan.zzf
            com.google.android.gms.internal.ads.zzgfo.zzr(r3, r0, r4)
            return
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzbvf r9, int r10) {
            r8 = this;
            com.google.android.gms.internal.ads.zzedb r7 = new com.google.android.gms.internal.ads.zzedb
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            android.os.Bundle r0 = r9.zzc
            if (r0 == 0) goto L29
            java.util.Set r1 = r0.keySet()
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = r0.getString(r2)
            if (r4 == 0) goto L13
            r3.put(r2, r4)
            goto L13
        L29:
            int r2 = r9.zzb
            java.lang.String r1 = r9.zza
            byte[] r4 = r9.zzd
            boolean r6 = r9.zze
            java.lang.String r5 = ""
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.google.android.gms.internal.ads.zzeyy r0 = r8.zzc
            com.google.android.gms.internal.ads.zzfac r1 = new com.google.android.gms.internal.ads.zzfac
            r1.<init>(r9)
            com.google.android.gms.internal.ads.zzeyy r0 = r0.zza(r1)
            com.google.android.gms.internal.ads.zzeyz r0 = r0.zzb()
            boolean r1 = r7.zzf
            if (r1 == 0) goto Lab
            java.lang.String r9 = r9.zza
            com.google.android.gms.internal.ads.zzbeb r1 = com.google.android.gms.internal.ads.zzbey.zzb
            java.lang.Object r1 = r1.zze()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L5b
            goto Lab
        L5b:
            android.net.Uri r9 = android.net.Uri.parse(r9)
            java.lang.String r9 = r9.getHost()
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 != 0) goto Lab
            r2 = 59
            com.google.android.gms.internal.ads.zzfxn r2 = com.google.android.gms.internal.ads.zzfxn.zzc(r2)
            com.google.android.gms.internal.ads.zzfym r2 = com.google.android.gms.internal.ads.zzfym.zzb(r2)
            java.lang.Iterable r1 = r2.zzc(r1)
            java.util.Iterator r1 = r1.iterator()
        L7b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lab
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r9.endsWith(r2)
            if (r2 == 0) goto L7b
            com.google.android.gms.internal.ads.zzexk r9 = r0.zza()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            com.google.common.util.concurrent.ListenableFuture r9 = r9.zza(r1, r2)
            com.google.android.gms.internal.ads.zzecr r1 = new com.google.android.gms.internal.ads.zzecr
            r1.<init>(r7)
            com.google.android.gms.internal.ads.zzgfz r2 = r8.zze
            com.google.common.util.concurrent.ListenableFuture r9 = com.google.android.gms.internal.ads.zzgfo.zzm(r9, r1, r2)
            goto Laf
        Lab:
            com.google.common.util.concurrent.ListenableFuture r9 = com.google.android.gms.internal.ads.zzgfo.zzh(r7)
        Laf:
            com.google.android.gms.internal.ads.zzflg r0 = r0.zzb()
            android.content.Context r1 = r8.zza
            com.google.android.gms.internal.ads.zzbwi r2 = r8.zzf
            com.google.android.gms.internal.ads.zzedd r3 = new com.google.android.gms.internal.ads.zzedd
            java.lang.String r4 = ""
            r3.<init>(r1, r4, r2, r10)
            com.google.android.gms.internal.ads.zzfla r10 = com.google.android.gms.internal.ads.zzfla.zzi
            com.google.android.gms.internal.ads.zzfkx r9 = r0.zzb(r10, r9)
            com.google.android.gms.internal.ads.zzfkx r9 = r9.zze(r3)
            com.google.android.gms.internal.ads.zzfkl r9 = r9.zza()
            com.google.android.gms.internal.ads.zzecs r10 = new com.google.android.gms.internal.ads.zzecs
            r10.<init>()
            com.google.android.gms.internal.ads.zzgfz r0 = r8.zze
            com.google.common.util.concurrent.ListenableFuture r9 = com.google.android.gms.internal.ads.zzgfo.zzn(r9, r10, r0)
            return r9
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zze(com.google.android.gms.internal.ads.zzbvf r2, com.google.android.gms.internal.ads.zzbvq r3) {
            r1 = this;
            int r0 = android.os.Binder.getCallingUid()
            com.google.common.util.concurrent.ListenableFuture r2 = r1.zzb(r2, r0)
            r1.zzc(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzf(com.google.android.gms.internal.ads.zzbvb r6, com.google.android.gms.internal.ads.zzbvq r7) {
            r5 = this;
            int r0 = android.os.Binder.getCallingUid()
            com.google.android.gms.internal.ads.zzeyp r1 = new com.google.android.gms.internal.ads.zzeyp
            r1.<init>(r6, r0)
            com.google.android.gms.internal.ads.zzeza r6 = r5.zzb
            com.google.android.gms.internal.ads.zzeza r6 = r6.zza(r1)
            com.google.android.gms.internal.ads.zzezb r6 = r6.zzb()
            com.google.android.gms.internal.ads.zzflg r0 = r6.zzb()
            com.google.android.gms.internal.ads.zzect r1 = new com.google.android.gms.internal.ads.zzect
            r1.<init>()
            com.google.android.gms.internal.ads.zzecu r2 = new com.google.android.gms.internal.ads.zzecu
            r2.<init>()
            com.google.android.gms.internal.ads.zzfla r3 = com.google.android.gms.internal.ads.zzfla.zze
            com.google.common.util.concurrent.ListenableFuture r4 = com.google.android.gms.internal.ads.zzgfo.zzi()
            com.google.android.gms.internal.ads.zzfkx r0 = r0.zzb(r3, r4)
            com.google.android.gms.internal.ads.zzecv r3 = new com.google.android.gms.internal.ads.zzecv
            r3.<init>(r6)
            com.google.android.gms.internal.ads.zzfkx r6 = r0.zzf(r3)
            com.google.android.gms.internal.ads.zzfkx r6 = r6.zze(r2)
            com.google.android.gms.internal.ads.zzfkx r6 = r6.zzf(r1)
            com.google.android.gms.internal.ads.zzfkl r6 = r6.zza()
            r5.zzc(r6, r7)
            com.google.android.gms.internal.ads.zzbeb r7 = com.google.android.gms.internal.ads.zzber.zzf
            java.lang.Object r7 = r7.zze()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L60
            com.google.android.gms.internal.ads.zzedh r7 = r5.zzd
            java.util.Objects.requireNonNull(r7)
            com.google.android.gms.internal.ads.zzecx r0 = new com.google.android.gms.internal.ads.zzecx
            r0.<init>(r7)
            com.google.android.gms.internal.ads.zzgfz r7 = r5.zze
            r6.addListener(r0, r7)
        L60:
            return
    }
}
