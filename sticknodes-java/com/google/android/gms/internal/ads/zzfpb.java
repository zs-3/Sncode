package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfpb implements com.google.android.gms.internal.ads.zzfpe {
    private static final com.google.android.gms.internal.ads.zzfpb zza = null;
    private java.util.Date zzb;
    private boolean zzc;
    private final com.google.android.gms.internal.ads.zzfpf zzd;
    private boolean zze;

    static {
            com.google.android.gms.internal.ads.zzfpb r0 = new com.google.android.gms.internal.ads.zzfpb
            com.google.android.gms.internal.ads.zzfpf r1 = new com.google.android.gms.internal.ads.zzfpf
            r1.<init>()
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzfpb.zza = r0
            return
    }

    private zzfpb(com.google.android.gms.internal.ads.zzfpf r1) {
            r0 = this;
            r0.<init>()
            r0.zzd = r1
            return
    }

    public static com.google.android.gms.internal.ads.zzfpb zza() {
            com.google.android.gms.internal.ads.zzfpb r0 = com.google.android.gms.internal.ads.zzfpb.zza
            return r0
    }

    public final java.util.Date zzb() {
            r1 = this;
            java.util.Date r0 = r1.zzb
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.clone()
            java.util.Date r0 = (java.util.Date) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfpe
    public final void zzc(boolean r4) {
            r3 = this;
            boolean r0 = r3.zze
            if (r0 != 0) goto L3f
            if (r4 == 0) goto L3f
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.util.Date r1 = r3.zzb
            if (r1 == 0) goto L15
            boolean r1 = r0.after(r1)
            if (r1 == 0) goto L3f
        L15:
            r3.zzb = r0
            boolean r0 = r3.zzc
            if (r0 == 0) goto L3f
            com.google.android.gms.internal.ads.zzfpd r0 = com.google.android.gms.internal.ads.zzfpd.zza()
            java.util.Collection r0 = r0.zzb()
            java.util.Iterator r0 = r0.iterator()
        L27:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzfom r1 = (com.google.android.gms.internal.ads.zzfom) r1
            com.google.android.gms.internal.ads.zzfpr r1 = r1.zzg()
            java.util.Date r2 = r3.zzb()
            r1.zzg(r2)
            goto L27
        L3f:
            r3.zze = r4
            return
    }

    public final void zzd(android.content.Context r2) {
            r1 = this;
            boolean r0 = r1.zzc
            if (r0 != 0) goto L1c
            com.google.android.gms.internal.ads.zzfpf r0 = r1.zzd
            r0.zzd(r2)
            com.google.android.gms.internal.ads.zzfpf r2 = r1.zzd
            r2.zze(r1)
            com.google.android.gms.internal.ads.zzfpf r2 = r1.zzd
            r2.zzf()
            com.google.android.gms.internal.ads.zzfpf r2 = r1.zzd
            boolean r2 = r2.zza
            r1.zze = r2
            r2 = 1
            r1.zzc = r2
        L1c:
            return
    }
}
