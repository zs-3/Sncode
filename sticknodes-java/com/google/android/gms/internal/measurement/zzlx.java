package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
public abstract class zzlx {
    public zzlx() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.google.android.gms.internal.measurement.zzlp zzb(java.lang.Class r11) {
            java.lang.Class<com.google.android.gms.internal.measurement.zzlx> r0 = com.google.android.gms.internal.measurement.zzlx.class
            java.lang.Class<com.google.android.gms.internal.measurement.zzlp> r1 = com.google.android.gms.internal.measurement.zzlp.class
            java.lang.ClassLoader r2 = r0.getClassLoader()
            boolean r1 = r11.equals(r1)
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L13
            java.lang.String r1 = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader"
            goto L3a
        L13:
            java.lang.Package r1 = r11.getPackage()
            java.lang.Package r5 = r0.getPackage()
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto Lfb
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Package r5 = r11.getPackage()
            java.lang.String r5 = r5.getName()
            r1[r4] = r5
            java.lang.String r5 = r11.getSimpleName()
            r1[r3] = r5
            java.lang.String r5 = "%s.BlazeGenerated%sLoader"
            java.lang.String r1 = java.lang.String.format(r5, r1)
        L3a:
            java.lang.Class r1 = java.lang.Class.forName(r1, r3, r2)     // Catch: java.lang.ClassNotFoundException -> L73
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L57 java.lang.IllegalAccessException -> L5e java.lang.InstantiationException -> L65 java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L73
            java.lang.reflect.Constructor r1 = r1.getConstructor(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L57 java.lang.IllegalAccessException -> L5e java.lang.InstantiationException -> L65 java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L73
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L57 java.lang.IllegalAccessException -> L5e java.lang.InstantiationException -> L65 java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L73
            java.lang.Object r1 = r1.newInstance(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L57 java.lang.IllegalAccessException -> L5e java.lang.InstantiationException -> L65 java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L73
            com.google.android.gms.internal.measurement.zzlx r1 = (com.google.android.gms.internal.measurement.zzlx) r1     // Catch: java.lang.reflect.InvocationTargetException -> L57 java.lang.IllegalAccessException -> L5e java.lang.InstantiationException -> L65 java.lang.NoSuchMethodException -> L6c java.lang.ClassNotFoundException -> L73
            com.google.android.gms.internal.measurement.zzlp r1 = r1.zza()     // Catch: java.lang.ClassNotFoundException -> L73
            java.lang.Object r1 = r11.cast(r1)     // Catch: java.lang.ClassNotFoundException -> L73
            com.google.android.gms.internal.measurement.zzlp r1 = (com.google.android.gms.internal.measurement.zzlp) r1     // Catch: java.lang.ClassNotFoundException -> L73
            return r1
        L57:
            r1 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.ClassNotFoundException -> L73
            r5.<init>(r1)     // Catch: java.lang.ClassNotFoundException -> L73
            throw r5     // Catch: java.lang.ClassNotFoundException -> L73
        L5e:
            r1 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.ClassNotFoundException -> L73
            r5.<init>(r1)     // Catch: java.lang.ClassNotFoundException -> L73
            throw r5     // Catch: java.lang.ClassNotFoundException -> L73
        L65:
            r1 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.ClassNotFoundException -> L73
            r5.<init>(r1)     // Catch: java.lang.ClassNotFoundException -> L73
            throw r5     // Catch: java.lang.ClassNotFoundException -> L73
        L6c:
            r1 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.ClassNotFoundException -> L73
            r5.<init>(r1)     // Catch: java.lang.ClassNotFoundException -> L73
            throw r5     // Catch: java.lang.ClassNotFoundException -> L73
        L73:
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r2)
            java.util.Iterator r0 = r0.iterator()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L80:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lba
            java.lang.Object r2 = r0.next()     // Catch: java.util.ServiceConfigurationError -> L9a
            com.google.android.gms.internal.measurement.zzlx r2 = (com.google.android.gms.internal.measurement.zzlx) r2     // Catch: java.util.ServiceConfigurationError -> L9a
            com.google.android.gms.internal.measurement.zzlp r2 = r2.zza()     // Catch: java.util.ServiceConfigurationError -> L9a
            java.lang.Object r2 = r11.cast(r2)     // Catch: java.util.ServiceConfigurationError -> L9a
            com.google.android.gms.internal.measurement.zzlp r2 = (com.google.android.gms.internal.measurement.zzlp) r2     // Catch: java.util.ServiceConfigurationError -> L9a
            r1.add(r2)     // Catch: java.util.ServiceConfigurationError -> L9a
            goto L80
        L9a:
            r2 = move-exception
            r10 = r2
            java.lang.Class<com.google.android.gms.internal.measurement.zzlk> r2 = com.google.android.gms.internal.measurement.zzlk.class
            java.lang.String r2 = r2.getName()
            java.util.logging.Logger r5 = java.util.logging.Logger.getLogger(r2)
            java.util.logging.Level r6 = java.util.logging.Level.SEVERE
            java.lang.String r2 = r11.getSimpleName()
            java.lang.String r7 = "Unable to load "
            java.lang.String r9 = r7.concat(r2)
            java.lang.String r7 = "com.google.protobuf.GeneratedExtensionRegistryLoader"
            java.lang.String r8 = "load"
            r5.logp(r6, r7, r8, r9, r10)
            goto L80
        Lba:
            int r0 = r1.size()
            if (r0 != r3) goto Lc7
            java.lang.Object r11 = r1.get(r4)
            com.google.android.gms.internal.measurement.zzlp r11 = (com.google.android.gms.internal.measurement.zzlp) r11
            return r11
        Lc7:
            int r0 = r1.size()
            r2 = 0
            if (r0 != 0) goto Lcf
            return r2
        Lcf:
            java.lang.String r0 = "combine"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.reflect.InvocationTargetException -> Le6 java.lang.IllegalAccessException -> Led java.lang.NoSuchMethodException -> Lf4
            java.lang.Class<java.util.Collection> r6 = java.util.Collection.class
            r5[r4] = r6     // Catch: java.lang.reflect.InvocationTargetException -> Le6 java.lang.IllegalAccessException -> Led java.lang.NoSuchMethodException -> Lf4
            java.lang.reflect.Method r11 = r11.getMethod(r0, r5)     // Catch: java.lang.reflect.InvocationTargetException -> Le6 java.lang.IllegalAccessException -> Led java.lang.NoSuchMethodException -> Lf4
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> Le6 java.lang.IllegalAccessException -> Led java.lang.NoSuchMethodException -> Lf4
            r0[r4] = r1     // Catch: java.lang.reflect.InvocationTargetException -> Le6 java.lang.IllegalAccessException -> Led java.lang.NoSuchMethodException -> Lf4
            java.lang.Object r11 = r11.invoke(r2, r0)     // Catch: java.lang.reflect.InvocationTargetException -> Le6 java.lang.IllegalAccessException -> Led java.lang.NoSuchMethodException -> Lf4
            com.google.android.gms.internal.measurement.zzlp r11 = (com.google.android.gms.internal.measurement.zzlp) r11     // Catch: java.lang.reflect.InvocationTargetException -> Le6 java.lang.IllegalAccessException -> Led java.lang.NoSuchMethodException -> Lf4
            return r11
        Le6:
            r11 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r11)
            throw r0
        Led:
            r11 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r11)
            throw r0
        Lf4:
            r11 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r11)
            throw r0
        Lfb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.getName()
            r0.<init>(r11)
            throw r0
    }

    protected abstract com.google.android.gms.internal.measurement.zzlp zza();
}
