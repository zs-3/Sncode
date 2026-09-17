package androidx.room;

/* loaded from: classes.dex */
public class Room {
    public static <T extends androidx.room.RoomDatabase> androidx.room.RoomDatabase.Builder<T> databaseBuilder(android.content.Context r1, java.lang.Class<T> r2, java.lang.String r3) {
            if (r3 == 0) goto L12
            java.lang.String r0 = r3.trim()
            int r0 = r0.length()
            if (r0 == 0) goto L12
            androidx.room.RoomDatabase$Builder r0 = new androidx.room.RoomDatabase$Builder
            r0.<init>(r1, r2, r3)
            return r0
        L12:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder"
            r1.<init>(r2)
            throw r1
    }

    static <T, C> T getGeneratedImplementation(java.lang.Class<C> r5, java.lang.String r6) {
            java.lang.Package r0 = r5.getPackage()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r5.getCanonicalName()
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L13
            goto L1d
        L13:
            int r2 = r0.length()
            int r2 = r2 + 1
            java.lang.String r1 = r1.substring(r2)
        L1d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 46
            r4 = 95
            java.lang.String r1 = r1.replace(r3, r4)
            r2.append(r1)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            boolean r1 = r0.isEmpty()     // Catch: java.lang.InstantiationException -> L59 java.lang.IllegalAccessException -> L74 java.lang.ClassNotFoundException -> L8f
            if (r1 == 0) goto L3c
            r0 = r6
            goto L50
        L3c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.InstantiationException -> L59 java.lang.IllegalAccessException -> L74 java.lang.ClassNotFoundException -> L8f
            r1.<init>()     // Catch: java.lang.InstantiationException -> L59 java.lang.IllegalAccessException -> L74 java.lang.ClassNotFoundException -> L8f
            r1.append(r0)     // Catch: java.lang.InstantiationException -> L59 java.lang.IllegalAccessException -> L74 java.lang.ClassNotFoundException -> L8f
            java.lang.String r0 = "."
            r1.append(r0)     // Catch: java.lang.InstantiationException -> L59 java.lang.IllegalAccessException -> L74 java.lang.ClassNotFoundException -> L8f
            r1.append(r6)     // Catch: java.lang.InstantiationException -> L59 java.lang.IllegalAccessException -> L74 java.lang.ClassNotFoundException -> L8f
            java.lang.String r0 = r1.toString()     // Catch: java.lang.InstantiationException -> L59 java.lang.IllegalAccessException -> L74 java.lang.ClassNotFoundException -> L8f
        L50:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.InstantiationException -> L59 java.lang.IllegalAccessException -> L74 java.lang.ClassNotFoundException -> L8f
            java.lang.Object r5 = r0.newInstance()     // Catch: java.lang.InstantiationException -> L59 java.lang.IllegalAccessException -> L74 java.lang.ClassNotFoundException -> L8f
            return r5
        L59:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to create an instance of "
            r0.append(r1)
            java.lang.String r5 = r5.getCanonicalName()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L74:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot access the constructor"
            r0.append(r1)
            java.lang.String r5 = r5.getCanonicalName()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L8f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cannot find implementation for "
            r1.append(r2)
            java.lang.String r5 = r5.getCanonicalName()
            r1.append(r5)
            java.lang.String r5 = ". "
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = " does not exist"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    public static <T extends androidx.room.RoomDatabase> androidx.room.RoomDatabase.Builder<T> inMemoryDatabaseBuilder(android.content.Context r2, java.lang.Class<T> r3) {
            androidx.room.RoomDatabase$Builder r0 = new androidx.room.RoomDatabase$Builder
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }
}
