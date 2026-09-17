package com.google.android.gms.internal.drive;

import com.google.android.gms.internal.drive.zzjx;

/* loaded from: classes.dex */
abstract class zzki<T extends com.google.android.gms.internal.drive.zzjx> {
    private static final java.util.logging.Logger logger = null;
    private static java.lang.String zzro;

    static {
            java.lang.Class<com.google.android.gms.internal.drive.zzjr> r0 = com.google.android.gms.internal.drive.zzjr.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.android.gms.internal.drive.zzki.logger = r0
            java.lang.String r0 = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader"
            com.google.android.gms.internal.drive.zzki.zzro = r0
            return
    }

    zzki() {
            r0 = this;
            r0.<init>()
            return
    }

    static <T extends com.google.android.gms.internal.drive.zzjx> T zza(java.lang.Class<T> r11) {
            java.lang.Class<com.google.android.gms.internal.drive.zzki> r0 = com.google.android.gms.internal.drive.zzki.class
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.lang.Class<com.google.android.gms.internal.drive.zzjx> r2 = com.google.android.gms.internal.drive.zzjx.class
            boolean r2 = r11.equals(r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L13
            java.lang.String r2 = com.google.android.gms.internal.drive.zzki.zzro
            goto L3a
        L13:
            java.lang.Package r2 = r11.getPackage()
            java.lang.Package r5 = r0.getPackage()
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L101
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Package r5 = r11.getPackage()
            java.lang.String r5 = r5.getName()
            r2[r4] = r5
            java.lang.String r5 = r11.getSimpleName()
            r2[r3] = r5
            java.lang.String r5 = "%s.BlazeGenerated%sLoader"
            java.lang.String r2 = java.lang.String.format(r5, r2)
        L3a:
            java.lang.Class r2 = java.lang.Class.forName(r2, r3, r1)     // Catch: java.lang.ClassNotFoundException -> L73
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L57 java.lang.IllegalAccessException -> L5e java.lang.InstantiationException -> L65 java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L73
            java.lang.reflect.Constructor r2 = r2.getConstructor(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L57 java.lang.IllegalAccessException -> L5e java.lang.InstantiationException -> L65 java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L73
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L57 java.lang.IllegalAccessException -> L5e java.lang.InstantiationException -> L65 java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L73
            java.lang.Object r2 = r2.newInstance(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L57 java.lang.IllegalAccessException -> L5e java.lang.InstantiationException -> L65 java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L73
            com.google.android.gms.internal.drive.zzki r2 = (com.google.android.gms.internal.drive.zzki) r2     // Catch: java.lang.reflect.InvocationTargetException -> L57 java.lang.IllegalAccessException -> L5e java.lang.InstantiationException -> L65 java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L73
            com.google.android.gms.internal.drive.zzjx r2 = r2.zzcu()     // Catch: java.lang.ClassNotFoundException -> L73
            java.lang.Object r2 = r11.cast(r2)     // Catch: java.lang.ClassNotFoundException -> L73
            com.google.android.gms.internal.drive.zzjx r2 = (com.google.android.gms.internal.drive.zzjx) r2     // Catch: java.lang.ClassNotFoundException -> L73
            return r2
        L57:
            r2 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.ClassNotFoundException -> L73
            r5.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> L73
            throw r5     // Catch: java.lang.ClassNotFoundException -> L73
        L5e:
            r2 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.ClassNotFoundException -> L73
            r5.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> L73
            throw r5     // Catch: java.lang.ClassNotFoundException -> L73
        L65:
            r2 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.ClassNotFoundException -> L73
            r5.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> L73
            throw r5     // Catch: java.lang.ClassNotFoundException -> L73
        L6c:
            r2 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.ClassNotFoundException -> L73
            r5.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> L73
            throw r5     // Catch: java.lang.ClassNotFoundException -> L73
        L73:
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L80:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lc0
            java.lang.Object r2 = r0.next()     // Catch: java.util.ServiceConfigurationError -> L9a
            com.google.android.gms.internal.drive.zzki r2 = (com.google.android.gms.internal.drive.zzki) r2     // Catch: java.util.ServiceConfigurationError -> L9a
            com.google.android.gms.internal.drive.zzjx r2 = r2.zzcu()     // Catch: java.util.ServiceConfigurationError -> L9a
            java.lang.Object r2 = r11.cast(r2)     // Catch: java.util.ServiceConfigurationError -> L9a
            com.google.android.gms.internal.drive.zzjx r2 = (com.google.android.gms.internal.drive.zzjx) r2     // Catch: java.util.ServiceConfigurationError -> L9a
            r1.add(r2)     // Catch: java.util.ServiceConfigurationError -> L9a
            goto L80
        L9a:
            r2 = move-exception
            r10 = r2
            java.util.logging.Logger r5 = com.google.android.gms.internal.drive.zzki.logger
            java.util.logging.Level r6 = java.util.logging.Level.SEVERE
            java.lang.String r2 = "Unable to load "
            java.lang.String r7 = r11.getSimpleName()
            int r8 = r7.length()
            if (r8 == 0) goto Lb2
            java.lang.String r2 = r2.concat(r7)
            r9 = r2
            goto Lb8
        Lb2:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r2)
            r9 = r7
        Lb8:
            java.lang.String r7 = "com.google.protobuf.GeneratedExtensionRegistryLoader"
            java.lang.String r8 = "load"
            r5.logp(r6, r7, r8, r9, r10)
            goto L80
        Lc0:
            int r0 = r1.size()
            if (r0 != r3) goto Lcd
            java.lang.Object r11 = r1.get(r4)
            com.google.android.gms.internal.drive.zzjx r11 = (com.google.android.gms.internal.drive.zzjx) r11
            return r11
        Lcd:
            int r0 = r1.size()
            r2 = 0
            if (r0 != 0) goto Ld5
            return r2
        Ld5:
            java.lang.String r0 = "combine"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.reflect.InvocationTargetException -> Lec java.lang.IllegalAccessException -> Lf3 java.lang.NoSuchMethodException -> Lfa
            java.lang.Class<java.util.Collection> r6 = java.util.Collection.class
            r5[r4] = r6     // Catch: java.lang.reflect.InvocationTargetException -> Lec java.lang.IllegalAccessException -> Lf3 java.lang.NoSuchMethodException -> Lfa
            java.lang.reflect.Method r11 = r11.getMethod(r0, r5)     // Catch: java.lang.reflect.InvocationTargetException -> Lec java.lang.IllegalAccessException -> Lf3 java.lang.NoSuchMethodException -> Lfa
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> Lec java.lang.IllegalAccessException -> Lf3 java.lang.NoSuchMethodException -> Lfa
            r0[r4] = r1     // Catch: java.lang.reflect.InvocationTargetException -> Lec java.lang.IllegalAccessException -> Lf3 java.lang.NoSuchMethodException -> Lfa
            java.lang.Object r11 = r11.invoke(r2, r0)     // Catch: java.lang.reflect.InvocationTargetException -> Lec java.lang.IllegalAccessException -> Lf3 java.lang.NoSuchMethodException -> Lfa
            com.google.android.gms.internal.drive.zzjx r11 = (com.google.android.gms.internal.drive.zzjx) r11     // Catch: java.lang.reflect.InvocationTargetException -> Lec java.lang.IllegalAccessException -> Lf3 java.lang.NoSuchMethodException -> Lfa
            return r11
        Lec:
            r11 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r11)
            throw r0
        Lf3:
            r11 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r11)
            throw r0
        Lfa:
            r11 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r11)
            throw r0
        L101:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.getName()
            r0.<init>(r11)
            throw r0
    }

    protected abstract T zzcu();
}
