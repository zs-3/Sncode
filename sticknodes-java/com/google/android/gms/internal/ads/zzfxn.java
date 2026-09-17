package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzfxn implements com.google.android.gms.internal.ads.zzfya {
    protected zzfxn() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.internal.ads.zzfxn zzc(char r1) {
            com.google.android.gms.internal.ads.zzfxk r0 = new com.google.android.gms.internal.ads.zzfxk
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    @java.lang.Deprecated
    public final /* synthetic */ boolean zza(java.lang.Object r1) {
            r0 = this;
            java.lang.Character r1 = (java.lang.Character) r1
            char r1 = r1.charValue()
            boolean r1 = r0.zzb(r1)
            return r1
    }

    public abstract boolean zzb(char r1);
}
