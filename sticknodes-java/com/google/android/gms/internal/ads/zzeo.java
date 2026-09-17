package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzeo implements com.google.android.gms.internal.ads.zzds {
    private android.os.Message zza;

    private zzeo() {
            r1 = this;
            r0 = 0
            throw r0
    }

    /* synthetic */ zzeo(com.google.android.gms.internal.ads.zzen r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzds
    public final void zza() {
            r1 = this;
            android.os.Message r0 = r1.zza
            java.util.Objects.requireNonNull(r0)
            r0.sendToTarget()
            r0 = 0
            r1.zza = r0
            com.google.android.gms.internal.ads.zzep.zzl(r1)
            return
    }

    public final com.google.android.gms.internal.ads.zzeo zzb(android.os.Message r1, com.google.android.gms.internal.ads.zzep r2) {
            r0 = this;
            r0.zza = r1
            return r0
    }

    public final boolean zzc(android.os.Handler r2) {
            r1 = this;
            android.os.Message r0 = r1.zza
            java.util.Objects.requireNonNull(r0)
            boolean r2 = r2.sendMessageAtFrontOfQueue(r0)
            r0 = 0
            r1.zza = r0
            com.google.android.gms.internal.ads.zzep.zzl(r1)
            return r2
    }
}
