package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public class AnnotatedData<T> {
    private final java.lang.Object zza;
    private final boolean zzb;

    public AnnotatedData(java.lang.Object r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public T get() {
            r1 = this;
            java.lang.Object r0 = r1.zza
            return r0
    }

    public boolean isStale() {
            r1 = this;
            boolean r0 = r1.zzb
            return r0
    }
}
