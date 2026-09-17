package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzfz {
    private static final char[] zza = null;

    static {
            r0 = 80
            char[] r0 = new char[r0]
            com.google.android.gms.internal.auth.zzfz.zza = r0
            r1 = 32
            java.util.Arrays.fill(r0, r1)
            return
    }

    static java.lang.String zza(com.google.android.gms.internal.auth.zzfx r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "# "
            r0.append(r1)
            r0.append(r3)
            r3 = 0
            zzd(r2, r0, r3)
            java.lang.String r2 = r0.toString()
            return r2
    }

    static void zzb(java.lang.StringBuilder r4, int r5, java.lang.String r6, java.lang.Object r7) {
            boolean r0 = r7 instanceof java.util.List
            if (r0 == 0) goto L19
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
        La:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r7.next()
            zzb(r4, r5, r6, r0)
            goto La
        L18:
            return
        L19:
            boolean r0 = r7 instanceof java.util.Map
            if (r0 == 0) goto L38
            java.util.Map r7 = (java.util.Map) r7
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L27:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            zzb(r4, r5, r6, r0)
            goto L27
        L37:
            return
        L38:
            r0 = 10
            r4.append(r0)
            zzc(r5, r4)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L7b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            char r1 = r6.charAt(r1)
            char r1 = java.lang.Character.toLowerCase(r1)
            r0.append(r1)
            r1 = 1
        L58:
            int r2 = r6.length()
            if (r1 >= r2) goto L77
            char r2 = r6.charAt(r1)
            boolean r3 = java.lang.Character.isUpperCase(r2)
            if (r3 == 0) goto L6d
            java.lang.String r3 = "_"
            r0.append(r3)
        L6d:
            char r2 = java.lang.Character.toLowerCase(r2)
            r0.append(r2)
            int r1 = r1 + 1
            goto L58
        L77:
            java.lang.String r6 = r0.toString()
        L7b:
            r4.append(r6)
            boolean r6 = r7 instanceof java.lang.String
            r0 = 34
            java.lang.String r1 = ": \""
            if (r6 == 0) goto La1
            r4.append(r1)
            java.lang.String r7 = (java.lang.String) r7
            com.google.android.gms.internal.auth.zzec r5 = new com.google.android.gms.internal.auth.zzec
            java.nio.charset.Charset r6 = com.google.android.gms.internal.auth.zzfa.zzb
            byte[] r6 = r7.getBytes(r6)
            r5.<init>(r6)
            java.lang.String r5 = com.google.android.gms.internal.auth.zzgx.zza(r5)
            r4.append(r5)
            r4.append(r0)
            return
        La1:
            boolean r6 = r7 instanceof com.google.android.gms.internal.auth.zzef
            if (r6 == 0) goto Lb5
            r4.append(r1)
            com.google.android.gms.internal.auth.zzef r7 = (com.google.android.gms.internal.auth.zzef) r7
            java.lang.String r5 = com.google.android.gms.internal.auth.zzgx.zza(r7)
            r4.append(r5)
            r4.append(r0)
            return
        Lb5:
            boolean r6 = r7 instanceof com.google.android.gms.internal.auth.zzev
            java.lang.String r0 = "}"
            java.lang.String r1 = "\n"
            java.lang.String r2 = " {"
            if (r6 == 0) goto Ld3
            r4.append(r2)
            com.google.android.gms.internal.auth.zzev r7 = (com.google.android.gms.internal.auth.zzev) r7
            int r6 = r5 + 2
            zzd(r7, r4, r6)
            r4.append(r1)
            zzc(r5, r4)
            r4.append(r0)
            return
        Ld3:
            boolean r6 = r7 instanceof java.util.Map.Entry
            if (r6 == 0) goto Lfa
            r4.append(r2)
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            int r6 = r5 + 2
            java.lang.Object r2 = r7.getKey()
            java.lang.String r3 = "key"
            zzb(r4, r6, r3, r2)
            java.lang.Object r7 = r7.getValue()
            java.lang.String r2 = "value"
            zzb(r4, r6, r2, r7)
            r4.append(r1)
            zzc(r5, r4)
            r4.append(r0)
            return
        Lfa:
            java.lang.String r5 = ": "
            r4.append(r5)
            r4.append(r7)
            return
    }

    private static void zzc(int r3, java.lang.StringBuilder r4) {
        L0:
            if (r3 <= 0) goto L10
            r0 = 80
            if (r3 <= r0) goto L7
            goto L8
        L7:
            r0 = r3
        L8:
            char[] r1 = com.google.android.gms.internal.auth.zzfz.zza
            r2 = 0
            r4.append(r1, r2, r0)
            int r3 = r3 - r0
            goto L0
        L10:
            return
    }

    private static void zzd(com.google.android.gms.internal.auth.zzfx r18, java.lang.StringBuilder r19, int r20) {
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.TreeMap r5 = new java.util.TreeMap
            r5.<init>()
            java.lang.Class r6 = r18.getClass()
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            int r7 = r6.length
            r8 = 0
            r9 = 0
        L20:
            java.lang.String r10 = "get"
            java.lang.String r11 = "has"
            java.lang.String r12 = "set"
            r13 = 3
            if (r9 >= r7) goto L89
            r14 = r6[r9]
            int r15 = r14.getModifiers()
            boolean r15 = java.lang.reflect.Modifier.isStatic(r15)
            if (r15 == 0) goto L36
            goto L86
        L36:
            java.lang.String r15 = r14.getName()
            int r15 = r15.length()
            if (r15 < r13) goto L86
            java.lang.String r13 = r14.getName()
            boolean r12 = r13.startsWith(r12)
            if (r12 == 0) goto L52
            java.lang.String r10 = r14.getName()
            r3.add(r10)
            goto L86
        L52:
            int r12 = r14.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isPublic(r12)
            if (r12 == 0) goto L86
            java.lang.Class[] r12 = r14.getParameterTypes()
            int r12 = r12.length
            if (r12 != 0) goto L86
            java.lang.String r12 = r14.getName()
            boolean r11 = r12.startsWith(r11)
            if (r11 == 0) goto L75
            java.lang.String r10 = r14.getName()
            r4.put(r10, r14)
            goto L86
        L75:
            java.lang.String r11 = r14.getName()
            boolean r10 = r11.startsWith(r10)
            if (r10 == 0) goto L86
            java.lang.String r10 = r14.getName()
            r5.put(r10, r14)
        L86:
            int r9 = r9 + 1
            goto L20
        L89:
            java.util.Set r6 = r5.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L91:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L201
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r9 = r7.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = r9.substring(r13)
            java.lang.String r14 = "List"
            boolean r15 = r9.endsWith(r14)
            if (r15 == 0) goto Le6
            java.lang.String r15 = "OrBuilderList"
            boolean r15 = r9.endsWith(r15)
            if (r15 != 0) goto Le6
            boolean r14 = r9.equals(r14)
            if (r14 != 0) goto Le6
            java.lang.Object r14 = r7.getValue()
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            if (r14 == 0) goto Le6
            java.lang.Class r15 = r14.getReturnType()
            java.lang.Class<java.util.List> r13 = java.util.List.class
            boolean r13 = r15.equals(r13)
            if (r13 == 0) goto Le6
            int r7 = r9.length()
            int r7 = r7 + (-4)
            java.lang.String r7 = r9.substring(r8, r7)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r9 = com.google.android.gms.internal.auth.zzev.zzg(r14, r0, r9)
            zzb(r1, r2, r7, r9)
            goto L1fe
        Le6:
            java.lang.String r13 = "Map"
            boolean r14 = r9.endsWith(r13)
            if (r14 == 0) goto L12f
            boolean r13 = r9.equals(r13)
            if (r13 != 0) goto L12f
            java.lang.Object r13 = r7.getValue()
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            if (r13 == 0) goto L12f
            java.lang.Class r14 = r13.getReturnType()
            java.lang.Class<java.util.Map> r15 = java.util.Map.class
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L12f
            java.lang.Class<java.lang.Deprecated> r14 = java.lang.Deprecated.class
            boolean r14 = r13.isAnnotationPresent(r14)
            if (r14 != 0) goto L12f
            int r14 = r13.getModifiers()
            boolean r14 = java.lang.reflect.Modifier.isPublic(r14)
            if (r14 == 0) goto L12f
            int r7 = r9.length()
            int r7 = r7 + (-3)
            java.lang.String r7 = r9.substring(r8, r7)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r9 = com.google.android.gms.internal.auth.zzev.zzg(r13, r0, r9)
            zzb(r1, r2, r7, r9)
            goto L1fe
        L12f:
            java.lang.String r13 = r12.concat(r9)
            boolean r13 = r3.contains(r13)
            if (r13 == 0) goto L1fe
            java.lang.String r13 = "Bytes"
            boolean r13 = r9.endsWith(r13)
            if (r13 == 0) goto L159
            int r13 = r9.length()
            int r13 = r13 + (-5)
            java.lang.String r13 = r9.substring(r8, r13)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r13 = r10.concat(r13)
            boolean r13 = r5.containsKey(r13)
            if (r13 != 0) goto L1fe
        L159:
            java.lang.Object r7 = r7.getValue()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.String r13 = r11.concat(r9)
            java.lang.Object r13 = r4.get(r13)
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            if (r7 == 0) goto L1fe
            java.lang.Object[] r14 = new java.lang.Object[r8]
            java.lang.Object r7 = com.google.android.gms.internal.auth.zzev.zzg(r7, r0, r14)
            if (r13 != 0) goto L1ed
            boolean r13 = r7 instanceof java.lang.Boolean
            if (r13 == 0) goto L182
            r13 = r7
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L1fe
            goto L1fb
        L182:
            boolean r13 = r7 instanceof java.lang.Integer
            if (r13 == 0) goto L191
            r13 = r7
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            if (r13 == 0) goto L1fe
            goto L1fb
        L191:
            boolean r13 = r7 instanceof java.lang.Float
            if (r13 == 0) goto L1a3
            r13 = r7
            java.lang.Float r13 = (java.lang.Float) r13
            float r13 = r13.floatValue()
            int r13 = java.lang.Float.floatToRawIntBits(r13)
            if (r13 == 0) goto L1fe
            goto L1fb
        L1a3:
            boolean r13 = r7 instanceof java.lang.Double
            if (r13 == 0) goto L1b9
            r13 = r7
            java.lang.Double r13 = (java.lang.Double) r13
            double r13 = r13.doubleValue()
            long r13 = java.lang.Double.doubleToRawLongBits(r13)
            r16 = 0
            int r15 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r15 == 0) goto L1fe
            goto L1fb
        L1b9:
            boolean r13 = r7 instanceof java.lang.String
            if (r13 == 0) goto L1c4
            java.lang.String r13 = ""
            boolean r13 = r7.equals(r13)
            goto L1ce
        L1c4:
            boolean r13 = r7 instanceof com.google.android.gms.internal.auth.zzef
            if (r13 == 0) goto L1d1
            com.google.android.gms.internal.auth.zzef r13 = com.google.android.gms.internal.auth.zzef.zzb
            boolean r13 = r7.equals(r13)
        L1ce:
            if (r13 != 0) goto L1fe
            goto L1fb
        L1d1:
            boolean r13 = r7 instanceof com.google.android.gms.internal.auth.zzfx
            if (r13 == 0) goto L1df
            r13 = r7
            com.google.android.gms.internal.auth.zzfx r13 = (com.google.android.gms.internal.auth.zzfx) r13
            com.google.android.gms.internal.auth.zzfx r13 = r13.zze()
            if (r7 == r13) goto L1fe
            goto L1fb
        L1df:
            boolean r13 = r7 instanceof java.lang.Enum
            if (r13 == 0) goto L1fb
            r13 = r7
            java.lang.Enum r13 = (java.lang.Enum) r13
            int r13 = r13.ordinal()
            if (r13 == 0) goto L1fe
            goto L1fb
        L1ed:
            java.lang.Object[] r14 = new java.lang.Object[r8]
            java.lang.Object r13 = com.google.android.gms.internal.auth.zzev.zzg(r13, r0, r14)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L1fe
        L1fb:
            zzb(r1, r2, r9, r7)
        L1fe:
            r13 = 3
            goto L91
        L201:
            boolean r3 = r0 instanceof com.google.android.gms.internal.auth.zzeu
            if (r3 != 0) goto L20f
            com.google.android.gms.internal.auth.zzev r0 = (com.google.android.gms.internal.auth.zzev) r0
            com.google.android.gms.internal.auth.zzha r0 = r0.zzc
            if (r0 == 0) goto L20e
            r0.zzg(r1, r2)
        L20e:
            return
        L20f:
            com.google.android.gms.internal.auth.zzeu r0 = (com.google.android.gms.internal.auth.zzeu) r0
            r0 = 0
            throw r0
    }
}
