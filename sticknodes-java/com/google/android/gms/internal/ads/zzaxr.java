package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaxr extends com.google.android.gms.internal.ads.zzayc {
    public zzaxr(com.google.android.gms.internal.ads.zzawo r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.internal.ads.zzasm r11, int r12, int r13) {
            r7 = this;
            java.lang.String r2 = "JZBFNEdYFhTFBTCRgtU3dDnkdlKXmKLHUW9VyRRgLZX35JOvzKEIQuHunyCpcG/w"
            java.lang.String r3 = "nv6PiabX0G4RLHtriKodA9C0rOBToujvB9ySFMp3wxE="
            r6 = 73
            r0 = r7
            r1 = r8
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r6 = this;
            java.lang.reflect.Method r0 = r6.zze     // Catch: java.lang.reflect.InvocationTargetException -> L23
            r1 = 0
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L23
            r4 = 0
            com.google.android.gms.internal.ads.zzawo r5 = r6.zza     // Catch: java.lang.reflect.InvocationTargetException -> L23
            android.content.Context r5 = r5.zzb()     // Catch: java.lang.reflect.InvocationTargetException -> L23
            r3[r4] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L23
            java.lang.Object r0 = r0.invoke(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L23
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.reflect.InvocationTargetException -> L23
            boolean r0 = r0.booleanValue()     // Catch: java.lang.reflect.InvocationTargetException -> L23
            com.google.android.gms.internal.ads.zzasm r1 = r6.zzd     // Catch: java.lang.reflect.InvocationTargetException -> L23
            if (r2 == r0) goto L1e
            goto L1f
        L1e:
            r2 = 2
        L1f:
            r1.zzaf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L23
            return
        L23:
            com.google.android.gms.internal.ads.zzasm r0 = r6.zzd
            r1 = 3
            r0.zzaf(r1)
            return
    }
}
