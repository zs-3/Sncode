package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzapy {
    public final int zza;
    public final byte[] zzb;
    public final java.util.Map zzc;
    public final java.util.List zzd;
    public final boolean zze;

    private zzapy(int r1, byte[] r2, java.util.Map r3, java.util.List r4, boolean r5, long r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            if (r4 != 0) goto Ld
            r1 = 0
            goto L11
        Ld:
            java.util.List r1 = java.util.Collections.unmodifiableList(r4)
        L11:
            r0.zzd = r1
            r0.zze = r5
            return
    }

    @java.lang.Deprecated
    public zzapy(int r9, byte[] r10, java.util.Map r11, boolean r12, long r13) {
            r8 = this;
            java.util.List r4 = zza(r11)
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public zzapy(int r9, byte[] r10, boolean r11, long r12, java.util.List r14) {
            r8 = this;
            if (r14 != 0) goto L5
            r0 = 0
        L3:
            r3 = r0
            goto L33
        L5:
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L10
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L3
        L10:
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            r0.<init>(r1)
            java.util.Iterator r1 = r14.iterator()
        L1b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.ads.zzapu r2 = (com.google.android.gms.internal.ads.zzapu) r2
            java.lang.String r3 = r2.zza()
            java.lang.String r2 = r2.zzb()
            r0.put(r3, r2)
            goto L1b
        L33:
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r14
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @java.lang.Deprecated
    public zzapy(byte[] r9, java.util.Map r10) {
            r8 = this;
            java.util.List r4 = zza(r10)
            r1 = 200(0xc8, float:2.8E-43)
            r5 = 0
            r6 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    private static java.util.List zza(java.util.Map r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto Lf
            java.util.List r4 = java.util.Collections.emptyList()
            return r4
        Lf:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L20:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.android.gms.internal.ads.zzapu r2 = new com.google.android.gms.internal.ads.zzapu
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r2.<init>(r3, r1)
            r0.add(r2)
            goto L20
        L41:
            return r0
    }
}
