package com.google.android.gms.internal.drive;

import com.google.android.gms.internal.drive.zzkd;

/* loaded from: classes.dex */
final class zzkb<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>> {
    private static final com.google.android.gms.internal.drive.zzkb zzov = null;
    final com.google.android.gms.internal.drive.zzmi<FieldDescriptorType, java.lang.Object> zzos;
    private boolean zzot;
    private boolean zzou;

    static {
            com.google.android.gms.internal.drive.zzkb r0 = new com.google.android.gms.internal.drive.zzkb
            r1 = 1
            r0.<init>(r1)
            com.google.android.gms.internal.drive.zzkb.zzov = r0
            return
    }

    private zzkb() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzou = r0
            r0 = 16
            com.google.android.gms.internal.drive.zzmi r0 = com.google.android.gms.internal.drive.zzmi.zzav(r0)
            r1.zzos = r0
            return
    }

    private zzkb(boolean r1) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.zzou = r1
            com.google.android.gms.internal.drive.zzmi r1 = com.google.android.gms.internal.drive.zzmi.zzav(r1)
            r0.zzos = r1
            r0.zzbp()
            return
    }

    static int zza(com.google.android.gms.internal.drive.zznm r1, int r2, java.lang.Object r3) {
            int r2 = com.google.android.gms.internal.drive.zzjr.zzab(r2)
            com.google.android.gms.internal.drive.zznm r0 = com.google.android.gms.internal.drive.zznm.zzxd
            if (r1 != r0) goto L10
            r0 = r3
            com.google.android.gms.internal.drive.zzlq r0 = (com.google.android.gms.internal.drive.zzlq) r0
            com.google.android.gms.internal.drive.zzkm.zzf(r0)
            int r2 = r2 << 1
        L10:
            int r1 = zzb(r1, r3)
            int r2 = r2 + r1
            return r2
    }

    private final java.lang.Object zza(FieldDescriptorType r2) {
            r1 = this;
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r0 = r1.zzos
            java.lang.Object r2 = r0.get(r2)
            boolean r0 = r2 instanceof com.google.android.gms.internal.drive.zzkt
            if (r0 == 0) goto Le
            com.google.android.gms.internal.drive.zzlq r2 = com.google.android.gms.internal.drive.zzkt.zzdp()
        Le:
            return r2
    }

    static void zza(com.google.android.gms.internal.drive.zzjr r1, com.google.android.gms.internal.drive.zznm r2, int r3, java.lang.Object r4) throws java.io.IOException {
            com.google.android.gms.internal.drive.zznm r0 = com.google.android.gms.internal.drive.zznm.zzxd
            if (r2 != r0) goto L15
            com.google.android.gms.internal.drive.zzlq r4 = (com.google.android.gms.internal.drive.zzlq) r4
            com.google.android.gms.internal.drive.zzkm.zzf(r4)
            r2 = 3
            r1.zzb(r3, r2)
            r4.zzb(r1)
            r2 = 4
            r1.zzb(r3, r2)
            return
        L15:
            int r0 = r2.zzfk()
            r1.zzb(r3, r0)
            int[] r3 = com.google.android.gms.internal.drive.zzkc.zzox
            int r2 = r2.ordinal()
            r2 = r3[r2]
            switch(r2) {
                case 1: goto Le8;
                case 2: goto Lde;
                case 3: goto Ld4;
                case 4: goto Lca;
                case 5: goto Lc0;
                case 6: goto Lb6;
                case 7: goto Lac;
                case 8: goto La2;
                case 9: goto L9c;
                case 10: goto L96;
                case 11: goto L86;
                case 12: goto L74;
                case 13: goto L6a;
                case 14: goto L60;
                case 15: goto L56;
                case 16: goto L4c;
                case 17: goto L42;
                case 18: goto L29;
                default: goto L27;
            }
        L27:
            goto Lf1
        L29:
            boolean r2 = r4 instanceof com.google.android.gms.internal.drive.zzkn
            if (r2 == 0) goto L37
            com.google.android.gms.internal.drive.zzkn r4 = (com.google.android.gms.internal.drive.zzkn) r4
            int r2 = r4.zzcp()
            r1.zzx(r2)
            return
        L37:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r2 = r4.intValue()
            r1.zzx(r2)
            goto Lf1
        L42:
            java.lang.Long r4 = (java.lang.Long) r4
            long r2 = r4.longValue()
            r1.zzm(r2)
            return
        L4c:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r2 = r4.intValue()
            r1.zzz(r2)
            return
        L56:
            java.lang.Long r4 = (java.lang.Long) r4
            long r2 = r4.longValue()
            r1.zzn(r2)
            return
        L60:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r2 = r4.intValue()
            r1.zzaa(r2)
            return
        L6a:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r2 = r4.intValue()
            r1.zzy(r2)
            return
        L74:
            boolean r2 = r4 instanceof com.google.android.gms.internal.drive.zzjc
            if (r2 == 0) goto L7e
            com.google.android.gms.internal.drive.zzjc r4 = (com.google.android.gms.internal.drive.zzjc) r4
            r1.zza(r4)
            return
        L7e:
            byte[] r4 = (byte[]) r4
            r2 = 0
            int r3 = r4.length
            r1.zzd(r4, r2, r3)
            return
        L86:
            boolean r2 = r4 instanceof com.google.android.gms.internal.drive.zzjc
            if (r2 == 0) goto L90
            com.google.android.gms.internal.drive.zzjc r4 = (com.google.android.gms.internal.drive.zzjc) r4
            r1.zza(r4)
            return
        L90:
            java.lang.String r4 = (java.lang.String) r4
            r1.zzl(r4)
            return
        L96:
            com.google.android.gms.internal.drive.zzlq r4 = (com.google.android.gms.internal.drive.zzlq) r4
            r1.zzb(r4)
            return
        L9c:
            com.google.android.gms.internal.drive.zzlq r4 = (com.google.android.gms.internal.drive.zzlq) r4
            r4.zzb(r1)
            return
        La2:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r2 = r4.booleanValue()
            r1.zzc(r2)
            return
        Lac:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r2 = r4.intValue()
            r1.zzaa(r2)
            return
        Lb6:
            java.lang.Long r4 = (java.lang.Long) r4
            long r2 = r4.longValue()
            r1.zzn(r2)
            return
        Lc0:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r2 = r4.intValue()
            r1.zzx(r2)
            return
        Lca:
            java.lang.Long r4 = (java.lang.Long) r4
            long r2 = r4.longValue()
            r1.zzl(r2)
            return
        Ld4:
            java.lang.Long r4 = (java.lang.Long) r4
            long r2 = r4.longValue()
            r1.zzl(r2)
            return
        Lde:
            java.lang.Float r4 = (java.lang.Float) r4
            float r2 = r4.floatValue()
            r1.zza(r2)
            return
        Le8:
            java.lang.Double r4 = (java.lang.Double) r4
            double r2 = r4.doubleValue()
            r1.zza(r2)
        Lf1:
            return
    }

    private final void zza(FieldDescriptorType r5, java.lang.Object r6) {
            r4 = this;
            boolean r0 = r5.zzcs()
            if (r0 == 0) goto L33
            boolean r0 = r6 instanceof java.util.List
            if (r0 == 0) goto L2b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r6 = (java.util.List) r6
            r0.addAll(r6)
            int r6 = r0.size()
            r1 = 0
        L19:
            if (r1 >= r6) goto L29
            java.lang.Object r2 = r0.get(r1)
            int r1 = r1 + 1
            com.google.android.gms.internal.drive.zznm r3 = r5.zzcq()
            zza(r3, r2)
            goto L19
        L29:
            r6 = r0
            goto L3a
        L2b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Wrong object type used with protocol message reflection."
            r5.<init>(r6)
            throw r5
        L33:
            com.google.android.gms.internal.drive.zznm r0 = r5.zzcq()
            zza(r0, r6)
        L3a:
            boolean r0 = r6 instanceof com.google.android.gms.internal.drive.zzkt
            if (r0 == 0) goto L41
            r0 = 1
            r4.zzou = r0
        L41:
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r0 = r4.zzos
            r0.zza(r5, r6)
            return
    }

    private static void zza(com.google.android.gms.internal.drive.zznm r2, java.lang.Object r3) {
            com.google.android.gms.internal.drive.zzkm.checkNotNull(r3)
            int[] r0 = com.google.android.gms.internal.drive.zzkc.zzow
            com.google.android.gms.internal.drive.zznr r2 = r2.zzfj()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L41;
                case 2: goto L3e;
                case 3: goto L3b;
                case 4: goto L38;
                case 5: goto L35;
                case 6: goto L32;
                case 7: goto L29;
                case 8: goto L20;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L44
        L15:
            boolean r2 = r3 instanceof com.google.android.gms.internal.drive.zzlq
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof com.google.android.gms.internal.drive.zzkt
            if (r2 == 0) goto L1e
            goto L43
        L1e:
            r0 = 0
            goto L43
        L20:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof com.google.android.gms.internal.drive.zzkn
            if (r2 == 0) goto L1e
            goto L43
        L29:
            boolean r2 = r3 instanceof com.google.android.gms.internal.drive.zzjc
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L1e
            goto L43
        L32:
            boolean r0 = r3 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r3 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r3 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r3 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r3 instanceof java.lang.Integer
        L43:
            r1 = r0
        L44:
            if (r1 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
    }

    public static int zzb(com.google.android.gms.internal.drive.zzkd<?> r3, java.lang.Object r4) {
            com.google.android.gms.internal.drive.zznm r0 = r3.zzcq()
            int r1 = r3.zzcp()
            boolean r2 = r3.zzcs()
            if (r2 == 0) goto L4d
            boolean r3 = r3.zzct()
            r2 = 0
            if (r3 == 0) goto L36
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r3 = r4.iterator()
        L1b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2b
            java.lang.Object r4 = r3.next()
            int r4 = zzb(r0, r4)
            int r2 = r2 + r4
            goto L1b
        L2b:
            int r3 = com.google.android.gms.internal.drive.zzjr.zzab(r1)
            int r3 = r3 + r2
            int r4 = com.google.android.gms.internal.drive.zzjr.zzaj(r2)
            int r3 = r3 + r4
            return r3
        L36:
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r3 = r4.iterator()
        L3c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4c
            java.lang.Object r4 = r3.next()
            int r4 = zza(r0, r1, r4)
            int r2 = r2 + r4
            goto L3c
        L4c:
            return r2
        L4d:
            int r3 = zza(r0, r1, r4)
            return r3
    }

    private static int zzb(com.google.android.gms.internal.drive.zznm r1, java.lang.Object r2) {
            int[] r0 = com.google.android.gms.internal.drive.zzkc.zzox
            int r1 = r1.ordinal()
            r1 = r0[r1]
            switch(r1) {
                case 1: goto Lee;
                case 2: goto Le3;
                case 3: goto Ld8;
                case 4: goto Lcd;
                case 5: goto Lc2;
                case 6: goto Lb7;
                case 7: goto Lac;
                case 8: goto La1;
                case 9: goto L9a;
                case 10: goto L88;
                case 11: goto L76;
                case 12: goto L64;
                case 13: goto L59;
                case 14: goto L4e;
                case 15: goto L43;
                case 16: goto L38;
                case 17: goto L2d;
                case 18: goto L13;
                default: goto Lb;
            }
        Lb:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "There is no way to get here, but the compiler thinks otherwise."
            r1.<init>(r2)
            throw r1
        L13:
            boolean r1 = r2 instanceof com.google.android.gms.internal.drive.zzkn
            if (r1 == 0) goto L22
            com.google.android.gms.internal.drive.zzkn r2 = (com.google.android.gms.internal.drive.zzkn) r2
            int r1 = r2.zzcp()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzah(r1)
            return r1
        L22:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzah(r1)
            return r1
        L2d:
            java.lang.Long r2 = (java.lang.Long) r2
            long r1 = r2.longValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzq(r1)
            return r1
        L38:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzae(r1)
            return r1
        L43:
            java.lang.Long r2 = (java.lang.Long) r2
            long r1 = r2.longValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzs(r1)
            return r1
        L4e:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzag(r1)
            return r1
        L59:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzad(r1)
            return r1
        L64:
            boolean r1 = r2 instanceof com.google.android.gms.internal.drive.zzjc
            if (r1 == 0) goto L6f
            com.google.android.gms.internal.drive.zzjc r2 = (com.google.android.gms.internal.drive.zzjc) r2
            int r1 = com.google.android.gms.internal.drive.zzjr.zzb(r2)
            return r1
        L6f:
            byte[] r2 = (byte[]) r2
            int r1 = com.google.android.gms.internal.drive.zzjr.zzc(r2)
            return r1
        L76:
            boolean r1 = r2 instanceof com.google.android.gms.internal.drive.zzjc
            if (r1 == 0) goto L81
            com.google.android.gms.internal.drive.zzjc r2 = (com.google.android.gms.internal.drive.zzjc) r2
            int r1 = com.google.android.gms.internal.drive.zzjr.zzb(r2)
            return r1
        L81:
            java.lang.String r2 = (java.lang.String) r2
            int r1 = com.google.android.gms.internal.drive.zzjr.zzm(r2)
            return r1
        L88:
            boolean r1 = r2 instanceof com.google.android.gms.internal.drive.zzkt
            if (r1 == 0) goto L93
            com.google.android.gms.internal.drive.zzkt r2 = (com.google.android.gms.internal.drive.zzkt) r2
            int r1 = com.google.android.gms.internal.drive.zzjr.zza(r2)
            return r1
        L93:
            com.google.android.gms.internal.drive.zzlq r2 = (com.google.android.gms.internal.drive.zzlq) r2
            int r1 = com.google.android.gms.internal.drive.zzjr.zzc(r2)
            return r1
        L9a:
            com.google.android.gms.internal.drive.zzlq r2 = (com.google.android.gms.internal.drive.zzlq) r2
            int r1 = com.google.android.gms.internal.drive.zzjr.zzd(r2)
            return r1
        La1:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r1 = r2.booleanValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzd(r1)
            return r1
        Lac:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzaf(r1)
            return r1
        Lb7:
            java.lang.Long r2 = (java.lang.Long) r2
            long r1 = r2.longValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzr(r1)
            return r1
        Lc2:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzac(r1)
            return r1
        Lcd:
            java.lang.Long r2 = (java.lang.Long) r2
            long r1 = r2.longValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzp(r1)
            return r1
        Ld8:
            java.lang.Long r2 = (java.lang.Long) r2
            long r1 = r2.longValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzo(r1)
            return r1
        Le3:
            java.lang.Float r2 = (java.lang.Float) r2
            float r1 = r2.floatValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzb(r1)
            return r1
        Lee:
            java.lang.Double r2 = (java.lang.Double) r2
            double r1 = r2.doubleValue()
            int r1 = com.google.android.gms.internal.drive.zzjr.zzb(r1)
            return r1
    }

    private static boolean zzb(java.util.Map.Entry<FieldDescriptorType, java.lang.Object> r4) {
            java.lang.Object r0 = r4.getKey()
            com.google.android.gms.internal.drive.zzkd r0 = (com.google.android.gms.internal.drive.zzkd) r0
            com.google.android.gms.internal.drive.zznr r1 = r0.zzcr()
            com.google.android.gms.internal.drive.zznr r2 = com.google.android.gms.internal.drive.zznr.zzxx
            r3 = 1
            if (r1 != r2) goto L51
            boolean r0 = r0.zzcs()
            r1 = 0
            if (r0 == 0) goto L33
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L20:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r0 = r4.next()
            com.google.android.gms.internal.drive.zzlq r0 = (com.google.android.gms.internal.drive.zzlq) r0
            boolean r0 = r0.isInitialized()
            if (r0 != 0) goto L20
            return r1
        L33:
            java.lang.Object r4 = r4.getValue()
            boolean r0 = r4 instanceof com.google.android.gms.internal.drive.zzlq
            if (r0 == 0) goto L44
            com.google.android.gms.internal.drive.zzlq r4 = (com.google.android.gms.internal.drive.zzlq) r4
            boolean r4 = r4.isInitialized()
            if (r4 != 0) goto L51
            return r1
        L44:
            boolean r4 = r4 instanceof com.google.android.gms.internal.drive.zzkt
            if (r4 == 0) goto L49
            return r3
        L49:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Wrong object type used with protocol message reflection."
            r4.<init>(r0)
            throw r4
        L51:
            return r3
    }

    private final void zzc(java.util.Map.Entry<FieldDescriptorType, java.lang.Object> r5) {
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            com.google.android.gms.internal.drive.zzkd r0 = (com.google.android.gms.internal.drive.zzkd) r0
            java.lang.Object r5 = r5.getValue()
            boolean r1 = r5 instanceof com.google.android.gms.internal.drive.zzkt
            if (r1 == 0) goto L12
            com.google.android.gms.internal.drive.zzlq r5 = com.google.android.gms.internal.drive.zzkt.zzdp()
        L12:
            boolean r1 = r0.zzcs()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r4.zza(r0)
            if (r1 != 0) goto L23
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L23:
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L29:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r5.next()
            r3 = r1
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = zze(r2)
            r3.add(r2)
            goto L29
        L3e:
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r5 = r4.zzos
            r5.zza(r0, r1)
            return
        L44:
            com.google.android.gms.internal.drive.zznr r1 = r0.zzcr()
            com.google.android.gms.internal.drive.zznr r2 = com.google.android.gms.internal.drive.zznr.zzxx
            if (r1 != r2) goto L7f
            java.lang.Object r1 = r4.zza(r0)
            if (r1 != 0) goto L5c
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r1 = r4.zzos
            java.lang.Object r5 = zze(r5)
            r1.zza(r0, r5)
            return
        L5c:
            boolean r2 = r1 instanceof com.google.android.gms.internal.drive.zzlx
            if (r2 == 0) goto L69
            com.google.android.gms.internal.drive.zzlx r1 = (com.google.android.gms.internal.drive.zzlx) r1
            com.google.android.gms.internal.drive.zzlx r5 = (com.google.android.gms.internal.drive.zzlx) r5
            com.google.android.gms.internal.drive.zzlx r5 = r0.zza(r1, r5)
            goto L79
        L69:
            com.google.android.gms.internal.drive.zzlq r1 = (com.google.android.gms.internal.drive.zzlq) r1
            com.google.android.gms.internal.drive.zzlr r1 = r1.zzcy()
            com.google.android.gms.internal.drive.zzlq r5 = (com.google.android.gms.internal.drive.zzlq) r5
            com.google.android.gms.internal.drive.zzlr r5 = r0.zza(r1, r5)
            com.google.android.gms.internal.drive.zzlq r5 = r5.zzdf()
        L79:
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r1 = r4.zzos
            r1.zza(r0, r5)
            return
        L7f:
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r1 = r4.zzos
            java.lang.Object r5 = zze(r5)
            r1.zza(r0, r5)
            return
    }

    public static <T extends com.google.android.gms.internal.drive.zzkd<T>> com.google.android.gms.internal.drive.zzkb<T> zzcn() {
            com.google.android.gms.internal.drive.zzkb r0 = com.google.android.gms.internal.drive.zzkb.zzov
            return r0
    }

    private static int zzd(java.util.Map.Entry<FieldDescriptorType, java.lang.Object> r4) {
            java.lang.Object r0 = r4.getKey()
            com.google.android.gms.internal.drive.zzkd r0 = (com.google.android.gms.internal.drive.zzkd) r0
            java.lang.Object r1 = r4.getValue()
            com.google.android.gms.internal.drive.zznr r2 = r0.zzcr()
            com.google.android.gms.internal.drive.zznr r3 = com.google.android.gms.internal.drive.zznr.zzxx
            if (r2 != r3) goto L44
            boolean r2 = r0.zzcs()
            if (r2 != 0) goto L44
            boolean r2 = r0.zzct()
            if (r2 != 0) goto L44
            boolean r0 = r1 instanceof com.google.android.gms.internal.drive.zzkt
            if (r0 == 0) goto L33
            java.lang.Object r4 = r4.getKey()
            com.google.android.gms.internal.drive.zzkd r4 = (com.google.android.gms.internal.drive.zzkd) r4
            int r4 = r4.zzcp()
            com.google.android.gms.internal.drive.zzkt r1 = (com.google.android.gms.internal.drive.zzkt) r1
            int r4 = com.google.android.gms.internal.drive.zzjr.zzb(r4, r1)
            return r4
        L33:
            java.lang.Object r4 = r4.getKey()
            com.google.android.gms.internal.drive.zzkd r4 = (com.google.android.gms.internal.drive.zzkd) r4
            int r4 = r4.zzcp()
            com.google.android.gms.internal.drive.zzlq r1 = (com.google.android.gms.internal.drive.zzlq) r1
            int r4 = com.google.android.gms.internal.drive.zzjr.zzb(r4, r1)
            return r4
        L44:
            int r4 = zzb(r0, r1)
            return r4
    }

    private static java.lang.Object zze(java.lang.Object r3) {
            boolean r0 = r3 instanceof com.google.android.gms.internal.drive.zzlx
            if (r0 == 0) goto Lb
            com.google.android.gms.internal.drive.zzlx r3 = (com.google.android.gms.internal.drive.zzlx) r3
            com.google.android.gms.internal.drive.zzlx r3 = r3.zzef()
            return r3
        Lb:
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L1a
            byte[] r3 = (byte[]) r3
            int r0 = r3.length
            byte[] r0 = new byte[r0]
            int r1 = r3.length
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r0, r2, r1)
            return r0
        L1a:
            return r3
    }

    public final /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r4 = this;
            com.google.android.gms.internal.drive.zzkb r0 = new com.google.android.gms.internal.drive.zzkb
            r0.<init>()
            r1 = 0
        L6:
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r2 = r4.zzos
            int r2 = r2.zzer()
            if (r1 >= r2) goto L24
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r2 = r4.zzos
            java.util.Map$Entry r2 = r2.zzaw(r1)
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.drive.zzkd r3 = (com.google.android.gms.internal.drive.zzkd) r3
            java.lang.Object r2 = r2.getValue()
            r0.zza(r3, r2)
            int r1 = r1 + 1
            goto L6
        L24:
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r1 = r4.zzos
            java.lang.Iterable r1 = r1.zzes()
            java.util.Iterator r1 = r1.iterator()
        L2e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.drive.zzkd r3 = (com.google.android.gms.internal.drive.zzkd) r3
            java.lang.Object r2 = r2.getValue()
            r0.zza(r3, r2)
            goto L2e
        L48:
            boolean r1 = r4.zzou
            r0.zzou = r1
            return r0
    }

    final java.util.Iterator<java.util.Map.Entry<FieldDescriptorType, java.lang.Object>> descendingIterator() {
            r2 = this;
            boolean r0 = r2.zzou
            if (r0 == 0) goto L14
            com.google.android.gms.internal.drive.zzkw r0 = new com.google.android.gms.internal.drive.zzkw
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r1 = r2.zzos
            java.util.Set r1 = r1.zzet()
            java.util.Iterator r1 = r1.iterator()
            r0.<init>(r1)
            return r0
        L14:
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r0 = r2.zzos
            java.util.Set r0 = r0.zzet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.internal.drive.zzkb
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            com.google.android.gms.internal.drive.zzkb r2 = (com.google.android.gms.internal.drive.zzkb) r2
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r0 = r1.zzos
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r2 = r2.zzos
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r0 = r1.zzos
            int r0 = r0.hashCode()
            return r0
    }

    public final boolean isImmutable() {
            r1 = this;
            boolean r0 = r1.zzot
            return r0
    }

    public final boolean isInitialized() {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r2 = r3.zzos
            int r2 = r2.zzer()
            if (r1 >= r2) goto L1a
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r2 = r3.zzos
            java.util.Map$Entry r2 = r2.zzaw(r1)
            boolean r2 = zzb(r2)
            if (r2 != 0) goto L17
            return r0
        L17:
            int r1 = r1 + 1
            goto L2
        L1a:
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r1 = r3.zzos
            java.lang.Iterable r1 = r1.zzes()
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            boolean r2 = zzb(r2)
            if (r2 != 0) goto L24
            return r0
        L37:
            r0 = 1
            return r0
    }

    public final java.util.Iterator<java.util.Map.Entry<FieldDescriptorType, java.lang.Object>> iterator() {
            r2 = this;
            boolean r0 = r2.zzou
            if (r0 == 0) goto L14
            com.google.android.gms.internal.drive.zzkw r0 = new com.google.android.gms.internal.drive.zzkw
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r1 = r2.zzos
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r0.<init>(r1)
            return r0
        L14:
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r0 = r2.zzos
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public final void zza(com.google.android.gms.internal.drive.zzkb<FieldDescriptorType> r3) {
            r2 = this;
            r0 = 0
        L1:
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r1 = r3.zzos
            int r1 = r1.zzer()
            if (r0 >= r1) goto L15
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r1 = r3.zzos
            java.util.Map$Entry r1 = r1.zzaw(r0)
            r2.zzc(r1)
            int r0 = r0 + 1
            goto L1
        L15:
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r3 = r3.zzos
            java.lang.Iterable r3 = r3.zzes()
            java.util.Iterator r3 = r3.iterator()
        L1f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r2.zzc(r0)
            goto L1f
        L2f:
            return
    }

    public final void zzbp() {
            r1 = this;
            boolean r0 = r1.zzot
            if (r0 == 0) goto L5
            return
        L5:
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r0 = r1.zzos
            r0.zzbp()
            r0 = 1
            r1.zzot = r0
            return
    }

    public final int zzco() {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r2 = r3.zzos
            int r2 = r2.zzer()
            if (r0 >= r2) goto L18
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r2 = r3.zzos
            java.util.Map$Entry r2 = r2.zzaw(r0)
            int r2 = zzd(r2)
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L2
        L18:
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r0 = r3.zzos
            java.lang.Iterable r0 = r0.zzes()
            java.util.Iterator r0 = r0.iterator()
        L22:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            int r2 = zzd(r2)
            int r1 = r1 + r2
            goto L22
        L34:
            return r1
    }
}
