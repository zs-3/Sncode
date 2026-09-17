package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdst implements com.google.android.gms.internal.ads.zzday, com.google.android.gms.internal.ads.zzczo, com.google.android.gms.internal.ads.zzcyd, com.google.android.gms.internal.ads.zzcyu, com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzddk {
    private final com.google.android.gms.internal.ads.zzbbu zza;
    private boolean zzb;

    public zzdst(com.google.android.gms.internal.ads.zzbbu r2, com.google.android.gms.internal.ads.zzfec r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzb = r0
            r1.zza = r2
            r0 = 2
            r2.zzc(r0)
            if (r3 == 0) goto L13
            r3 = 1101(0x44d, float:1.543E-42)
            r2.zzc(r3)
        L13:
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzb     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L10
            com.google.android.gms.internal.ads.zzbbu r0 = r2.zza     // Catch: java.lang.Throwable -> L19
            r1 = 7
            r0.zzc(r1)     // Catch: java.lang.Throwable -> L19
            r0 = 1
            r2.zzb = r0     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            return
        L10:
            com.google.android.gms.internal.ads.zzbbu r0 = r2.zza     // Catch: java.lang.Throwable -> L19
            r1 = 8
            r0.zzc(r1)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            return
        L19:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzdB(com.google.android.gms.ads.internal.client.zze r2) {
            r1 = this;
            int r2 = r2.zza
            switch(r2) {
                case 1: goto L3b;
                case 2: goto L33;
                case 3: goto L2c;
                case 4: goto L24;
                case 5: goto L1c;
                case 6: goto L14;
                case 7: goto Lc;
                default: goto L5;
            }
        L5:
            com.google.android.gms.internal.ads.zzbbu r2 = r1.zza
            r0 = 4
            r2.zzc(r0)
            return
        Lc:
            com.google.android.gms.internal.ads.zzbbu r2 = r1.zza
            r0 = 106(0x6a, float:1.49E-43)
            r2.zzc(r0)
            return
        L14:
            com.google.android.gms.internal.ads.zzbbu r2 = r1.zza
            r0 = 105(0x69, float:1.47E-43)
            r2.zzc(r0)
            return
        L1c:
            com.google.android.gms.internal.ads.zzbbu r2 = r1.zza
            r0 = 104(0x68, float:1.46E-43)
            r2.zzc(r0)
            return
        L24:
            com.google.android.gms.internal.ads.zzbbu r2 = r1.zza
            r0 = 103(0x67, float:1.44E-43)
            r2.zzc(r0)
            return
        L2c:
            com.google.android.gms.internal.ads.zzbbu r2 = r1.zza
            r0 = 5
            r2.zzc(r0)
            return
        L33:
            com.google.android.gms.internal.ads.zzbbu r2 = r1.zza
            r0 = 102(0x66, float:1.43E-43)
            r2.zzc(r0)
            return
        L3b:
            com.google.android.gms.internal.ads.zzbbu r2 = r1.zza
            r0 = 101(0x65, float:1.42E-43)
            r2.zzc(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final void zzdn(com.google.android.gms.internal.ads.zzbwa r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzday
    public final void zzdo(com.google.android.gms.internal.ads.zzfgt r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzdsp r0 = new com.google.android.gms.internal.ads.zzdsp
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzbbu r2 = r1.zza
            r2.zzb(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzddk
    public final void zzh() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbbu r0 = r2.zza
            r1 = 1109(0x455, float:1.554E-42)
            r0.zzc(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzddk
    public final void zzi(com.google.android.gms.internal.ads.zzbcb.zzb r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzdss r0 = new com.google.android.gms.internal.ads.zzdss
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzbbu r2 = r1.zza
            r2.zzb(r0)
            com.google.android.gms.internal.ads.zzbbu r2 = r1.zza
            r0 = 1103(0x44f, float:1.546E-42)
            r2.zzc(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzddk
    public final void zzj(com.google.android.gms.internal.ads.zzbcb.zzb r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzdsq r0 = new com.google.android.gms.internal.ads.zzdsq
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzbbu r2 = r1.zza
            r2.zzb(r0)
            com.google.android.gms.internal.ads.zzbbu r2 = r1.zza
            r0 = 1102(0x44e, float:1.544E-42)
            r2.zzc(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzddk
    public final void zzl(boolean r2) {
            r1 = this;
            r0 = 1
            if (r0 == r2) goto L6
            r2 = 1108(0x454, float:1.553E-42)
            goto L8
        L6:
            r2 = 1107(0x453, float:1.551E-42)
        L8:
            com.google.android.gms.internal.ads.zzbbu r0 = r1.zza
            r0.zzc(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzddk
    public final void zzm(com.google.android.gms.internal.ads.zzbcb.zzb r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzdsr r0 = new com.google.android.gms.internal.ads.zzdsr
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzbbu r2 = r1.zza
            r2.zzb(r0)
            com.google.android.gms.internal.ads.zzbbu r2 = r1.zza
            r0 = 1104(0x450, float:1.547E-42)
            r2.zzc(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzddk
    public final void zzn(boolean r2) {
            r1 = this;
            r0 = 1
            if (r0 == r2) goto L6
            r2 = 1106(0x452, float:1.55E-42)
            goto L8
        L6:
            r2 = 1105(0x451, float:1.548E-42)
        L8:
            com.google.android.gms.internal.ads.zzbbu r0 = r1.zza
            r0.zzc(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final synchronized void zzr() {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzbbu r0 = r2.zza     // Catch: java.lang.Throwable -> L9
            r1 = 6
            r0.zzc(r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return
        L9:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzs() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbbu r0 = r2.zza
            r1 = 3
            r0.zzc(r1)
            return
    }
}
