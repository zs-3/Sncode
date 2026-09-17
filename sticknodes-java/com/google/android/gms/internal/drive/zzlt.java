package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzlt {
    static java.lang.String zza(com.google.android.gms.internal.drive.zzlq r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "# "
            r0.append(r1)
            r0.append(r3)
            r3 = 0
            zza(r2, r0, r3)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static void zza(com.google.android.gms.internal.drive.zzlq r18, java.lang.StringBuilder r19, int r20) {
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.TreeSet r5 = new java.util.TreeSet
            r5.<init>()
            java.lang.Class r6 = r18.getClass()
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()
            int r7 = r6.length
            r8 = 0
            r9 = 0
        L20:
            java.lang.String r10 = "get"
            if (r9 >= r7) goto L4f
            r11 = r6[r9]
            java.lang.String r12 = r11.getName()
            r4.put(r12, r11)
            java.lang.Class[] r12 = r11.getParameterTypes()
            int r12 = r12.length
            if (r12 != 0) goto L4c
            java.lang.String r12 = r11.getName()
            r3.put(r12, r11)
            java.lang.String r12 = r11.getName()
            boolean r10 = r12.startsWith(r10)
            if (r10 == 0) goto L4c
            java.lang.String r10 = r11.getName()
            r5.add(r10)
        L4c:
            int r9 = r9 + 1
            goto L20
        L4f:
            java.util.Iterator r5 = r5.iterator()
        L53:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L26a
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = ""
            java.lang.String r9 = r6.replaceFirst(r10, r7)
            java.lang.String r11 = "List"
            boolean r12 = r9.endsWith(r11)
            r13 = 1
            if (r12 == 0) goto Lc9
            java.lang.String r12 = "OrBuilderList"
            boolean r12 = r9.endsWith(r12)
            if (r12 != 0) goto Lc9
            boolean r11 = r9.equals(r11)
            if (r11 != 0) goto Lc9
            java.lang.String r11 = r9.substring(r8, r13)
            java.lang.String r11 = r11.toLowerCase()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r12 = r9.length()
            int r12 = r12 + (-4)
            java.lang.String r12 = r9.substring(r13, r12)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r14 = r12.length()
            if (r14 == 0) goto La1
            java.lang.String r11 = r11.concat(r12)
            goto La7
        La1:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r11)
            r11 = r12
        La7:
            java.lang.Object r12 = r3.get(r6)
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            if (r12 == 0) goto Lc9
            java.lang.Class r14 = r12.getReturnType()
            java.lang.Class<java.util.List> r15 = java.util.List.class
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto Lc9
            java.lang.String r6 = zzo(r11)
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.Object r7 = com.google.android.gms.internal.drive.zzkk.zza(r12, r0, r7)
            zza(r1, r2, r6, r7)
            goto L53
        Lc9:
            java.lang.String r11 = "Map"
            boolean r12 = r9.endsWith(r11)
            if (r12 == 0) goto L137
            boolean r11 = r9.equals(r11)
            if (r11 != 0) goto L137
            java.lang.String r11 = r9.substring(r8, r13)
            java.lang.String r11 = r11.toLowerCase()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r12 = r9.length()
            int r12 = r12 + (-3)
            java.lang.String r12 = r9.substring(r13, r12)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r14 = r12.length()
            if (r14 == 0) goto Lfc
            java.lang.String r11 = r11.concat(r12)
            goto L102
        Lfc:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r11)
            r11 = r12
        L102:
            java.lang.Object r6 = r3.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L137
            java.lang.Class r12 = r6.getReturnType()
            java.lang.Class<java.util.Map> r14 = java.util.Map.class
            boolean r12 = r12.equals(r14)
            if (r12 == 0) goto L137
            java.lang.Class<java.lang.Deprecated> r12 = java.lang.Deprecated.class
            boolean r12 = r6.isAnnotationPresent(r12)
            if (r12 != 0) goto L137
            int r12 = r6.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isPublic(r12)
            if (r12 == 0) goto L137
            java.lang.String r7 = zzo(r11)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Object r6 = com.google.android.gms.internal.drive.zzkk.zza(r6, r0, r9)
            zza(r1, r2, r7, r6)
            goto L53
        L137:
            java.lang.String r6 = "set"
            int r11 = r9.length()
            if (r11 == 0) goto L144
            java.lang.String r6 = r6.concat(r9)
            goto L14a
        L144:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r6)
            r6 = r11
        L14a:
            java.lang.Object r6 = r4.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L53
            java.lang.String r6 = "Bytes"
            boolean r6 = r9.endsWith(r6)
            if (r6 == 0) goto L17e
            int r6 = r9.length()
            int r6 = r6 + (-5)
            java.lang.String r6 = r9.substring(r8, r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r11 = r6.length()
            if (r11 == 0) goto L173
            java.lang.String r6 = r10.concat(r6)
            goto L178
        L173:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r10)
        L178:
            boolean r6 = r3.containsKey(r6)
            if (r6 != 0) goto L53
        L17e:
            java.lang.String r6 = r9.substring(r8, r13)
            java.lang.String r6 = r6.toLowerCase()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r11 = r9.substring(r13)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r12 = r11.length()
            if (r12 == 0) goto L19d
            java.lang.String r6 = r6.concat(r11)
            goto L1a3
        L19d:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r6)
            r6 = r11
        L1a3:
            int r11 = r9.length()
            if (r11 == 0) goto L1ae
            java.lang.String r11 = r10.concat(r9)
            goto L1b3
        L1ae:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r10)
        L1b3:
            java.lang.Object r11 = r3.get(r11)
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            java.lang.String r12 = "has"
            int r14 = r9.length()
            if (r14 == 0) goto L1c6
            java.lang.String r9 = r12.concat(r9)
            goto L1cb
        L1c6:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r12)
        L1cb:
            java.lang.Object r9 = r3.get(r9)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r11 == 0) goto L53
            java.lang.Object[] r12 = new java.lang.Object[r8]
            java.lang.Object r11 = com.google.android.gms.internal.drive.zzkk.zza(r11, r0, r12)
            if (r9 != 0) goto L253
            boolean r9 = r11 instanceof java.lang.Boolean
            if (r9 == 0) goto L1ed
            r7 = r11
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L1eb
        L1e8:
            r7 = 1
            goto L24e
        L1eb:
            r7 = 0
            goto L24e
        L1ed:
            boolean r9 = r11 instanceof java.lang.Integer
            if (r9 == 0) goto L1fb
            r7 = r11
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != 0) goto L1eb
            goto L1e8
        L1fb:
            boolean r9 = r11 instanceof java.lang.Float
            if (r9 == 0) goto L20c
            r7 = r11
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L1eb
            goto L1e8
        L20c:
            boolean r9 = r11 instanceof java.lang.Double
            if (r9 == 0) goto L21e
            r7 = r11
            java.lang.Double r7 = (java.lang.Double) r7
            double r14 = r7.doubleValue()
            r16 = 0
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 != 0) goto L1eb
            goto L1e8
        L21e:
            boolean r9 = r11 instanceof java.lang.String
            if (r9 == 0) goto L227
            boolean r7 = r11.equals(r7)
            goto L24e
        L227:
            boolean r7 = r11 instanceof com.google.android.gms.internal.drive.zzjc
            if (r7 == 0) goto L232
            com.google.android.gms.internal.drive.zzjc r7 = com.google.android.gms.internal.drive.zzjc.zznq
            boolean r7 = r11.equals(r7)
            goto L24e
        L232:
            boolean r7 = r11 instanceof com.google.android.gms.internal.drive.zzlq
            if (r7 == 0) goto L240
            r7 = r11
            com.google.android.gms.internal.drive.zzlq r7 = (com.google.android.gms.internal.drive.zzlq) r7
            com.google.android.gms.internal.drive.zzlq r7 = r7.zzda()
            if (r11 != r7) goto L1eb
            goto L1e8
        L240:
            boolean r7 = r11 instanceof java.lang.Enum
            if (r7 == 0) goto L1eb
            r7 = r11
            java.lang.Enum r7 = (java.lang.Enum) r7
            int r7 = r7.ordinal()
            if (r7 != 0) goto L1eb
            goto L1e8
        L24e:
            if (r7 != 0) goto L251
            goto L25f
        L251:
            r13 = 0
            goto L25f
        L253:
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.Object r7 = com.google.android.gms.internal.drive.zzkk.zza(r9, r0, r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r13 = r7.booleanValue()
        L25f:
            if (r13 == 0) goto L53
            java.lang.String r6 = zzo(r6)
            zza(r1, r2, r6, r11)
            goto L53
        L26a:
            boolean r3 = r0 instanceof com.google.android.gms.internal.drive.zzkk.zzc
            if (r3 == 0) goto L28d
            r3 = r0
            com.google.android.gms.internal.drive.zzkk$zzc r3 = (com.google.android.gms.internal.drive.zzkk.zzc) r3
            com.google.android.gms.internal.drive.zzkb<java.lang.Object> r3 = r3.zzrw
            java.util.Iterator r3 = r3.iterator()
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L27e
            goto L28d
        L27e:
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getKey()
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L28d:
            com.google.android.gms.internal.drive.zzkk r0 = (com.google.android.gms.internal.drive.zzkk) r0
            com.google.android.gms.internal.drive.zzmy r0 = r0.zzrq
            if (r0 == 0) goto L296
            r0.zza(r1, r2)
        L296:
            return
    }

    static final void zza(java.lang.StringBuilder r6, int r7, java.lang.String r8, java.lang.Object r9) {
            boolean r0 = r9 instanceof java.util.List
            if (r0 == 0) goto L19
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r9 = r9.iterator()
        La:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r9.next()
            zza(r6, r7, r8, r0)
            goto La
        L18:
            return
        L19:
            boolean r0 = r9 instanceof java.util.Map
            if (r0 == 0) goto L38
            java.util.Map r9 = (java.util.Map) r9
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L27:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            zza(r6, r7, r8, r0)
            goto L27
        L37:
            return
        L38:
            r0 = 10
            r6.append(r0)
            r0 = 0
            r1 = 0
        L3f:
            r2 = 32
            if (r1 >= r7) goto L49
            r6.append(r2)
            int r1 = r1 + 1
            goto L3f
        L49:
            r6.append(r8)
            boolean r8 = r9 instanceof java.lang.String
            r1 = 34
            java.lang.String r3 = ": \""
            if (r8 == 0) goto L68
            r6.append(r3)
            java.lang.String r9 = (java.lang.String) r9
            com.google.android.gms.internal.drive.zzjc r7 = com.google.android.gms.internal.drive.zzjc.zzk(r9)
            java.lang.String r7 = com.google.android.gms.internal.drive.zzmt.zzc(r7)
            r6.append(r7)
            r6.append(r1)
            return
        L68:
            boolean r8 = r9 instanceof com.google.android.gms.internal.drive.zzjc
            if (r8 == 0) goto L7c
            r6.append(r3)
            com.google.android.gms.internal.drive.zzjc r9 = (com.google.android.gms.internal.drive.zzjc) r9
            java.lang.String r7 = com.google.android.gms.internal.drive.zzmt.zzc(r9)
            r6.append(r7)
            r6.append(r1)
            return
        L7c:
            boolean r8 = r9 instanceof com.google.android.gms.internal.drive.zzkk
            java.lang.String r1 = "}"
            java.lang.String r3 = "\n"
            java.lang.String r4 = " {"
            if (r8 == 0) goto L9f
            r6.append(r4)
            com.google.android.gms.internal.drive.zzkk r9 = (com.google.android.gms.internal.drive.zzkk) r9
            int r8 = r7 + 2
            zza(r9, r6, r8)
            r6.append(r3)
        L93:
            if (r0 >= r7) goto L9b
            r6.append(r2)
            int r0 = r0 + 1
            goto L93
        L9b:
            r6.append(r1)
            return
        L9f:
            boolean r8 = r9 instanceof java.util.Map.Entry
            if (r8 == 0) goto Lcb
            r6.append(r4)
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            int r8 = r7 + 2
            java.lang.Object r4 = r9.getKey()
            java.lang.String r5 = "key"
            zza(r6, r8, r5, r4)
            java.lang.Object r9 = r9.getValue()
            java.lang.String r4 = "value"
            zza(r6, r8, r4, r9)
            r6.append(r3)
        Lbf:
            if (r0 >= r7) goto Lc7
            r6.append(r2)
            int r0 = r0 + 1
            goto Lbf
        Lc7:
            r6.append(r1)
            return
        Lcb:
            java.lang.String r7 = ": "
            r6.append(r7)
            java.lang.String r7 = r9.toString()
            r6.append(r7)
            return
    }

    private static final java.lang.String zzo(java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.length()
            if (r1 >= r2) goto L25
            char r2 = r4.charAt(r1)
            boolean r3 = java.lang.Character.isUpperCase(r2)
            if (r3 == 0) goto L1b
            java.lang.String r3 = "_"
            r0.append(r3)
        L1b:
            char r2 = java.lang.Character.toLowerCase(r2)
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L25:
            java.lang.String r4 = r0.toString()
            return r4
    }
}
