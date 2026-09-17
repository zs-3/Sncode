package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaxl extends com.google.android.gms.internal.ads.zzayc {
    public zzaxl(com.google.android.gms.internal.ads.zzawo r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.internal.ads.zzasm r11, int r12, int r13) {
            r7 = this;
            java.lang.String r2 = "QkUPtkYUgz2Q7QzT++W7/LvSL/+jztV0vuOJ6F0a3TCpRf9UbWz3aw54p4TaC7dW"
            java.lang.String r3 = "AjndXp1s5xIDXysf7TNVubDac7r00lcAtHKozpGmJzQ="
            r6 = 76
            r0 = r7
            r1 = r8
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r5 = this;
            java.lang.reflect.Method r0 = r5.zze
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.google.android.gms.internal.ads.zzawo r3 = r5.zza
            android.content.Context r3 = r3.zzb()
            r4 = 0
            r2[r4] = r3
            r3 = 0
            java.lang.Object r0 = r0.invoke(r3, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r1 == r0) goto L1c
            goto L1d
        L1c:
            r1 = 2
        L1d:
            com.google.android.gms.internal.ads.zzasm r0 = r5.zzd
            r0.zzad(r1)
            return
    }
}
