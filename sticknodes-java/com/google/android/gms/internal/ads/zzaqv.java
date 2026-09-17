package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaqv {
    long zza;
    final java.lang.String zzb;
    final java.lang.String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final java.util.List zzh;

    zzaqv(java.lang.String r14, com.google.android.gms.internal.ads.zzapl r15) {
            r13 = this;
            java.lang.String r2 = r15.zzb
            long r3 = r15.zzc
            long r5 = r15.zzd
            long r7 = r15.zze
            long r9 = r15.zzf
            java.util.List r0 = r15.zzh
            if (r0 == 0) goto L10
        Le:
            r11 = r0
            goto L44
        L10:
            java.util.Map r15 = r15.zzg
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L23:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto Le
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.android.gms.internal.ads.zzapu r11 = new com.google.android.gms.internal.ads.zzapu
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r12, r1)
            r0.add(r11)
            goto L23
        L44:
            r0 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return
    }

    private zzaqv(java.lang.String r2, java.lang.String r3, long r4, long r6, long r8, long r10, java.util.List r12) {
            r1 = this;
            r1.<init>()
            r1.zzb = r2
            java.lang.String r2 = ""
            boolean r2 = r2.equals(r3)
            r0 = 1
            if (r0 != r2) goto Lf
            r3 = 0
        Lf:
            r1.zzc = r3
            r1.zzd = r4
            r1.zze = r6
            r1.zzf = r8
            r1.zzg = r10
            r1.zzh = r12
            return
    }

    static com.google.android.gms.internal.ads.zzaqv zza(com.google.android.gms.internal.ads.zzaqw r16) throws java.io.IOException {
            int r0 = com.google.android.gms.internal.ads.zzaqy.zze(r16)
            r1 = 538247942(0x20150306, float:1.2621791E-19)
            if (r0 != r1) goto L70
            java.lang.String r3 = com.google.android.gms.internal.ads.zzaqy.zzh(r16)
            java.lang.String r4 = com.google.android.gms.internal.ads.zzaqy.zzh(r16)
            long r5 = com.google.android.gms.internal.ads.zzaqy.zzf(r16)
            long r7 = com.google.android.gms.internal.ads.zzaqy.zzf(r16)
            long r9 = com.google.android.gms.internal.ads.zzaqy.zzf(r16)
            long r11 = com.google.android.gms.internal.ads.zzaqy.zzf(r16)
            int r0 = com.google.android.gms.internal.ads.zzaqy.zze(r16)
            if (r0 < 0) goto L59
            if (r0 != 0) goto L2e
            java.util.List r1 = java.util.Collections.emptyList()
            goto L33
        L2e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L33:
            r13 = r1
            r1 = 0
        L35:
            if (r1 >= r0) goto L52
            java.lang.String r2 = com.google.android.gms.internal.ads.zzaqy.zzh(r16)
            java.lang.String r2 = r2.intern()
            java.lang.String r14 = com.google.android.gms.internal.ads.zzaqy.zzh(r16)
            java.lang.String r14 = r14.intern()
            com.google.android.gms.internal.ads.zzapu r15 = new com.google.android.gms.internal.ads.zzapu
            r15.<init>(r2, r14)
            r13.add(r15)
            int r1 = r1 + 1
            goto L35
        L52:
            com.google.android.gms.internal.ads.zzaqv r0 = new com.google.android.gms.internal.ads.zzaqv
            r2 = r0
            r2.<init>(r3, r4, r5, r7, r9, r11, r13)
            return r0
        L59:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "readHeaderList size="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L70:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>()
            throw r0
    }
}
