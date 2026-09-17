package androidx.room.util;

/* loaded from: classes.dex */
public class TableInfo {
    public final java.util.Map<java.lang.String, androidx.room.util.TableInfo.Column> columns;
    public final java.util.Set<androidx.room.util.TableInfo.ForeignKey> foreignKeys;
    public final java.util.Set<androidx.room.util.TableInfo.Index> indices;
    public final java.lang.String name;

    public static class Column {
        public final int affinity;
        public final java.lang.String defaultValue;
        private final int mCreatedFrom;
        public final java.lang.String name;
        public final boolean notNull;
        public final int primaryKeyPosition;
        public final java.lang.String type;

        public Column(java.lang.String r1, java.lang.String r2, boolean r3, int r4, java.lang.String r5, int r6) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.type = r2
                r0.notNull = r3
                r0.primaryKeyPosition = r4
                int r1 = findAffinity(r2)
                r0.affinity = r1
                r0.defaultValue = r5
                r0.mCreatedFrom = r6
                return
        }

        private static int findAffinity(java.lang.String r2) {
                r0 = 5
                if (r2 != 0) goto L4
                return r0
            L4:
                java.util.Locale r1 = java.util.Locale.US
                java.lang.String r2 = r2.toUpperCase(r1)
                java.lang.String r1 = "INT"
                boolean r1 = r2.contains(r1)
                if (r1 == 0) goto L14
                r2 = 3
                return r2
            L14:
                java.lang.String r1 = "CHAR"
                boolean r1 = r2.contains(r1)
                if (r1 != 0) goto L53
                java.lang.String r1 = "CLOB"
                boolean r1 = r2.contains(r1)
                if (r1 != 0) goto L53
                java.lang.String r1 = "TEXT"
                boolean r1 = r2.contains(r1)
                if (r1 == 0) goto L2d
                goto L53
            L2d:
                java.lang.String r1 = "BLOB"
                boolean r1 = r2.contains(r1)
                if (r1 == 0) goto L36
                return r0
            L36:
                java.lang.String r0 = "REAL"
                boolean r0 = r2.contains(r0)
                if (r0 != 0) goto L51
                java.lang.String r0 = "FLOA"
                boolean r0 = r2.contains(r0)
                if (r0 != 0) goto L51
                java.lang.String r0 = "DOUB"
                boolean r2 = r2.contains(r0)
                if (r2 == 0) goto L4f
                goto L51
            L4f:
                r2 = 1
                return r2
            L51:
                r2 = 4
                return r2
            L53:
                r2 = 2
                return r2
        }

        public boolean equals(java.lang.Object r6) {
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L4
                return r0
            L4:
                r1 = 0
                if (r6 == 0) goto L7c
                java.lang.Class r2 = r5.getClass()
                java.lang.Class r3 = r6.getClass()
                if (r2 == r3) goto L13
                goto L7c
            L13:
                androidx.room.util.TableInfo$Column r6 = (androidx.room.util.TableInfo.Column) r6
                int r2 = r5.primaryKeyPosition
                int r3 = r6.primaryKeyPosition
                if (r2 == r3) goto L1c
                return r1
            L1c:
                java.lang.String r2 = r5.name
                java.lang.String r3 = r6.name
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L27
                return r1
            L27:
                boolean r2 = r5.notNull
                boolean r3 = r6.notNull
                if (r2 == r3) goto L2e
                return r1
            L2e:
                int r2 = r5.mCreatedFrom
                r3 = 2
                if (r2 != r0) goto L44
                int r2 = r6.mCreatedFrom
                if (r2 != r3) goto L44
                java.lang.String r2 = r5.defaultValue
                if (r2 == 0) goto L44
                java.lang.String r4 = r6.defaultValue
                boolean r2 = r2.equals(r4)
                if (r2 != 0) goto L44
                return r1
            L44:
                int r2 = r5.mCreatedFrom
                if (r2 != r3) goto L59
                int r2 = r6.mCreatedFrom
                if (r2 != r0) goto L59
                java.lang.String r2 = r6.defaultValue
                if (r2 == 0) goto L59
                java.lang.String r3 = r5.defaultValue
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L59
                return r1
            L59:
                int r2 = r5.mCreatedFrom
                if (r2 == 0) goto L73
                int r3 = r6.mCreatedFrom
                if (r2 != r3) goto L73
                java.lang.String r2 = r5.defaultValue
                if (r2 == 0) goto L6e
                java.lang.String r3 = r6.defaultValue
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L73
                goto L72
            L6e:
                java.lang.String r2 = r6.defaultValue
                if (r2 == 0) goto L73
            L72:
                return r1
            L73:
                int r2 = r5.affinity
                int r6 = r6.affinity
                if (r2 != r6) goto L7a
                goto L7b
            L7a:
                r0 = 0
            L7b:
                return r0
            L7c:
                return r1
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.name
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                int r1 = r2.affinity
                int r0 = r0 + r1
                int r0 = r0 * 31
                boolean r1 = r2.notNull
                if (r1 == 0) goto L14
                r1 = 1231(0x4cf, float:1.725E-42)
                goto L16
            L14:
                r1 = 1237(0x4d5, float:1.733E-42)
            L16:
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.primaryKeyPosition
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Column{name='"
                r0.append(r1)
                java.lang.String r1 = r3.name
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                java.lang.String r2 = ", type='"
                r0.append(r2)
                java.lang.String r2 = r3.type
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", affinity='"
                r0.append(r2)
                int r2 = r3.affinity
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", notNull="
                r0.append(r2)
                boolean r2 = r3.notNull
                r0.append(r2)
                java.lang.String r2 = ", primaryKeyPosition="
                r0.append(r2)
                int r2 = r3.primaryKeyPosition
                r0.append(r2)
                java.lang.String r2 = ", defaultValue='"
                r0.append(r2)
                java.lang.String r2 = r3.defaultValue
                r0.append(r2)
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class ForeignKey {
        public final java.util.List<java.lang.String> columnNames;
        public final java.lang.String onDelete;
        public final java.lang.String onUpdate;
        public final java.util.List<java.lang.String> referenceColumnNames;
        public final java.lang.String referenceTable;

        public ForeignKey(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.util.List<java.lang.String> r4, java.util.List<java.lang.String> r5) {
                r0 = this;
                r0.<init>()
                r0.referenceTable = r1
                r0.onDelete = r2
                r0.onUpdate = r3
                java.util.List r1 = java.util.Collections.unmodifiableList(r4)
                r0.columnNames = r1
                java.util.List r1 = java.util.Collections.unmodifiableList(r5)
                r0.referenceColumnNames = r1
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                if (r3 != r4) goto L4
                r4 = 1
                return r4
            L4:
                r0 = 0
                if (r4 == 0) goto L49
                java.lang.Class r1 = r3.getClass()
                java.lang.Class r2 = r4.getClass()
                if (r1 == r2) goto L12
                goto L49
            L12:
                androidx.room.util.TableInfo$ForeignKey r4 = (androidx.room.util.TableInfo.ForeignKey) r4
                java.lang.String r1 = r3.referenceTable
                java.lang.String r2 = r4.referenceTable
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L1f
                return r0
            L1f:
                java.lang.String r1 = r3.onDelete
                java.lang.String r2 = r4.onDelete
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L2a
                return r0
            L2a:
                java.lang.String r1 = r3.onUpdate
                java.lang.String r2 = r4.onUpdate
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L35
                return r0
            L35:
                java.util.List<java.lang.String> r1 = r3.columnNames
                java.util.List<java.lang.String> r2 = r4.columnNames
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L40
                return r0
            L40:
                java.util.List<java.lang.String> r0 = r3.referenceColumnNames
                java.util.List<java.lang.String> r4 = r4.referenceColumnNames
                boolean r4 = r0.equals(r4)
                return r4
            L49:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.referenceTable
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r2.onDelete
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r2.onUpdate
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<java.lang.String> r1 = r2.columnNames
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<java.lang.String> r1 = r2.referenceColumnNames
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ForeignKey{referenceTable='"
                r0.append(r1)
                java.lang.String r1 = r3.referenceTable
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                java.lang.String r2 = ", onDelete='"
                r0.append(r2)
                java.lang.String r2 = r3.onDelete
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", onUpdate='"
                r0.append(r2)
                java.lang.String r2 = r3.onUpdate
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = ", columnNames="
                r0.append(r1)
                java.util.List<java.lang.String> r1 = r3.columnNames
                r0.append(r1)
                java.lang.String r1 = ", referenceColumnNames="
                r0.append(r1)
                java.util.List<java.lang.String> r1 = r3.referenceColumnNames
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static class ForeignKeyWithSequence implements java.lang.Comparable<androidx.room.util.TableInfo.ForeignKeyWithSequence> {
        final java.lang.String mFrom;
        final int mId;
        final int mSequence;
        final java.lang.String mTo;

        ForeignKeyWithSequence(int r1, int r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.mId = r1
                r0.mSequence = r2
                r0.mFrom = r3
                r0.mTo = r4
                return
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(androidx.room.util.TableInfo.ForeignKeyWithSequence r3) {
                r2 = this;
                int r0 = r2.mId
                int r1 = r3.mId
                int r0 = r0 - r1
                if (r0 != 0) goto Lc
                int r0 = r2.mSequence
                int r3 = r3.mSequence
                int r0 = r0 - r3
            Lc:
                return r0
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(androidx.room.util.TableInfo.ForeignKeyWithSequence r1) {
                r0 = this;
                androidx.room.util.TableInfo$ForeignKeyWithSequence r1 = (androidx.room.util.TableInfo.ForeignKeyWithSequence) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }
    }

    public static class Index {
        public final java.util.List<java.lang.String> columns;
        public final java.lang.String name;
        public final boolean unique;

        public Index(java.lang.String r1, boolean r2, java.util.List<java.lang.String> r3) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.unique = r2
                r0.columns = r3
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                if (r3 != r4) goto L4
                r4 = 1
                return r4
            L4:
                r0 = 0
                if (r4 == 0) goto L40
                java.lang.Class r1 = r3.getClass()
                java.lang.Class r2 = r4.getClass()
                if (r1 == r2) goto L12
                goto L40
            L12:
                androidx.room.util.TableInfo$Index r4 = (androidx.room.util.TableInfo.Index) r4
                boolean r1 = r3.unique
                boolean r2 = r4.unique
                if (r1 == r2) goto L1b
                return r0
            L1b:
                java.util.List<java.lang.String> r1 = r3.columns
                java.util.List<java.lang.String> r2 = r4.columns
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L26
                return r0
            L26:
                java.lang.String r0 = r3.name
                java.lang.String r1 = "index_"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L37
                java.lang.String r4 = r4.name
                boolean r4 = r4.startsWith(r1)
                return r4
            L37:
                java.lang.String r0 = r3.name
                java.lang.String r4 = r4.name
                boolean r4 = r0.equals(r4)
                return r4
            L40:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.name
                java.lang.String r1 = "index_"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto Le
                r0 = -1184239155(0xffffffffb969f1cd, float:-2.231069E-4)
                goto L14
            Le:
                java.lang.String r0 = r2.name
                int r0 = r0.hashCode()
            L14:
                int r0 = r0 * 31
                boolean r1 = r2.unique
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<java.lang.String> r1 = r2.columns
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Index{name='"
                r0.append(r1)
                java.lang.String r1 = r2.name
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                java.lang.String r1 = ", unique="
                r0.append(r1)
                boolean r1 = r2.unique
                r0.append(r1)
                java.lang.String r1 = ", columns="
                r0.append(r1)
                java.util.List<java.lang.String> r1 = r2.columns
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public TableInfo(java.lang.String r1, java.util.Map<java.lang.String, androidx.room.util.TableInfo.Column> r2, java.util.Set<androidx.room.util.TableInfo.ForeignKey> r3, java.util.Set<androidx.room.util.TableInfo.Index> r4) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r2)
            r0.columns = r1
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r3)
            r0.foreignKeys = r1
            if (r4 != 0) goto L15
            r1 = 0
            goto L19
        L15:
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r4)
        L19:
            r0.indices = r1
            return
    }

    public static androidx.room.util.TableInfo read(androidx.sqlite.db.SupportSQLiteDatabase r3, java.lang.String r4) {
            java.util.Map r0 = readColumns(r3, r4)
            java.util.Set r1 = readForeignKeys(r3, r4)
            java.util.Set r3 = readIndices(r3, r4)
            androidx.room.util.TableInfo r2 = new androidx.room.util.TableInfo
            r2.<init>(r4, r0, r1, r3)
            return r2
    }

    private static java.util.Map<java.lang.String, androidx.room.util.TableInfo.Column> readColumns(androidx.sqlite.db.SupportSQLiteDatabase r14, java.lang.String r15) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PRAGMA table_info(`"
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = "`)"
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            android.database.Cursor r14 = r14.query(r15)
            java.util.HashMap r15 = new java.util.HashMap
            r15.<init>()
            int r0 = r14.getColumnCount()     // Catch: java.lang.Throwable -> L74
            if (r0 <= 0) goto L70
            java.lang.String r0 = "name"
            int r0 = r14.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = "type"
            int r1 = r14.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = "notnull"
            int r2 = r14.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L74
            java.lang.String r3 = "pk"
            int r3 = r14.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L74
            java.lang.String r4 = "dflt_value"
            int r4 = r14.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L74
        L43:
            boolean r5 = r14.moveToNext()     // Catch: java.lang.Throwable -> L74
            if (r5 == 0) goto L70
            java.lang.String r5 = r14.getString(r0)     // Catch: java.lang.Throwable -> L74
            java.lang.String r8 = r14.getString(r1)     // Catch: java.lang.Throwable -> L74
            int r6 = r14.getInt(r2)     // Catch: java.lang.Throwable -> L74
            if (r6 == 0) goto L5a
            r6 = 1
            r9 = 1
            goto L5c
        L5a:
            r6 = 0
            r9 = 0
        L5c:
            int r10 = r14.getInt(r3)     // Catch: java.lang.Throwable -> L74
            java.lang.String r11 = r14.getString(r4)     // Catch: java.lang.Throwable -> L74
            androidx.room.util.TableInfo$Column r13 = new androidx.room.util.TableInfo$Column     // Catch: java.lang.Throwable -> L74
            r12 = 2
            r6 = r13
            r7 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L74
            r15.put(r5, r13)     // Catch: java.lang.Throwable -> L74
            goto L43
        L70:
            r14.close()
            return r15
        L74:
            r15 = move-exception
            r14.close()
            throw r15
    }

    private static java.util.List<androidx.room.util.TableInfo.ForeignKeyWithSequence> readForeignKeyFieldMappings(android.database.Cursor r12) {
            java.lang.String r0 = "id"
            int r0 = r12.getColumnIndex(r0)
            java.lang.String r1 = "seq"
            int r1 = r12.getColumnIndex(r1)
            java.lang.String r2 = "from"
            int r2 = r12.getColumnIndex(r2)
            java.lang.String r3 = "to"
            int r3 = r12.getColumnIndex(r3)
            int r4 = r12.getCount()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
        L22:
            if (r6 >= r4) goto L42
            r12.moveToPosition(r6)
            androidx.room.util.TableInfo$ForeignKeyWithSequence r7 = new androidx.room.util.TableInfo$ForeignKeyWithSequence
            int r8 = r12.getInt(r0)
            int r9 = r12.getInt(r1)
            java.lang.String r10 = r12.getString(r2)
            java.lang.String r11 = r12.getString(r3)
            r7.<init>(r8, r9, r10, r11)
            r5.add(r7)
            int r6 = r6 + 1
            goto L22
        L42:
            java.util.Collections.sort(r5)
            return r5
    }

    private static java.util.Set<androidx.room.util.TableInfo.ForeignKey> readForeignKeys(androidx.sqlite.db.SupportSQLiteDatabase r18, java.lang.String r19) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "PRAGMA foreign_key_list(`"
            r1.append(r2)
            r2 = r19
            r1.append(r2)
            java.lang.String r2 = "`)"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r18
            android.database.Cursor r1 = r2.query(r1)
            java.lang.String r2 = "id"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> La5
            java.lang.String r3 = "seq"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> La5
            java.lang.String r4 = "table"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.Throwable -> La5
            java.lang.String r5 = "on_delete"
            int r5 = r1.getColumnIndex(r5)     // Catch: java.lang.Throwable -> La5
            java.lang.String r6 = "on_update"
            int r6 = r1.getColumnIndex(r6)     // Catch: java.lang.Throwable -> La5
            java.util.List r7 = readForeignKeyFieldMappings(r1)     // Catch: java.lang.Throwable -> La5
            int r8 = r1.getCount()     // Catch: java.lang.Throwable -> La5
            r9 = 0
        L4a:
            if (r9 >= r8) goto La1
            r1.moveToPosition(r9)     // Catch: java.lang.Throwable -> La5
            int r10 = r1.getInt(r3)     // Catch: java.lang.Throwable -> La5
            if (r10 == 0) goto L56
            goto L9e
        L56:
            int r10 = r1.getInt(r2)     // Catch: java.lang.Throwable -> La5
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La5
            r15.<init>()     // Catch: java.lang.Throwable -> La5
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La5
            r14.<init>()     // Catch: java.lang.Throwable -> La5
            java.util.Iterator r11 = r7.iterator()     // Catch: java.lang.Throwable -> La5
        L68:
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> La5
            if (r12 == 0) goto L83
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> La5
            androidx.room.util.TableInfo$ForeignKeyWithSequence r12 = (androidx.room.util.TableInfo.ForeignKeyWithSequence) r12     // Catch: java.lang.Throwable -> La5
            int r13 = r12.mId     // Catch: java.lang.Throwable -> La5
            if (r13 != r10) goto L68
            java.lang.String r13 = r12.mFrom     // Catch: java.lang.Throwable -> La5
            r15.add(r13)     // Catch: java.lang.Throwable -> La5
            java.lang.String r12 = r12.mTo     // Catch: java.lang.Throwable -> La5
            r14.add(r12)     // Catch: java.lang.Throwable -> La5
            goto L68
        L83:
            androidx.room.util.TableInfo$ForeignKey r10 = new androidx.room.util.TableInfo$ForeignKey     // Catch: java.lang.Throwable -> La5
            java.lang.String r12 = r1.getString(r4)     // Catch: java.lang.Throwable -> La5
            java.lang.String r13 = r1.getString(r5)     // Catch: java.lang.Throwable -> La5
            java.lang.String r16 = r1.getString(r6)     // Catch: java.lang.Throwable -> La5
            r11 = r10
            r17 = r14
            r14 = r16
            r16 = r17
            r11.<init>(r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> La5
            r0.add(r10)     // Catch: java.lang.Throwable -> La5
        L9e:
            int r9 = r9 + 1
            goto L4a
        La1:
            r1.close()
            return r0
        La5:
            r0 = move-exception
            r1.close()
            throw r0
    }

    private static androidx.room.util.TableInfo.Index readIndex(androidx.sqlite.db.SupportSQLiteDatabase r6, java.lang.String r7, boolean r8) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PRAGMA index_xinfo(`"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = "`)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.database.Cursor r6 = r6.query(r0)
            java.lang.String r0 = "seqno"
            int r0 = r6.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = "cid"
            int r1 = r6.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r2 = "name"
            int r2 = r6.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L74
            r3 = -1
            if (r0 == r3) goto L6f
            if (r1 == r3) goto L6f
            if (r2 != r3) goto L34
            goto L6f
        L34:
            java.util.TreeMap r3 = new java.util.TreeMap     // Catch: java.lang.Throwable -> L74
            r3.<init>()     // Catch: java.lang.Throwable -> L74
        L39:
            boolean r4 = r6.moveToNext()     // Catch: java.lang.Throwable -> L74
            if (r4 == 0) goto L56
            int r4 = r6.getInt(r1)     // Catch: java.lang.Throwable -> L74
            if (r4 >= 0) goto L46
            goto L39
        L46:
            int r4 = r6.getInt(r0)     // Catch: java.lang.Throwable -> L74
            java.lang.String r5 = r6.getString(r2)     // Catch: java.lang.Throwable -> L74
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L74
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L74
            goto L39
        L56:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L74
            int r1 = r3.size()     // Catch: java.lang.Throwable -> L74
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L74
            java.util.Collection r1 = r3.values()     // Catch: java.lang.Throwable -> L74
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L74
            androidx.room.util.TableInfo$Index r1 = new androidx.room.util.TableInfo$Index     // Catch: java.lang.Throwable -> L74
            r1.<init>(r7, r8, r0)     // Catch: java.lang.Throwable -> L74
            r6.close()
            return r1
        L6f:
            r7 = 0
            r6.close()
            return r7
        L74:
            r7 = move-exception
            r6.close()
            throw r7
    }

    private static java.util.Set<androidx.room.util.TableInfo.Index> readIndices(androidx.sqlite.db.SupportSQLiteDatabase r8, java.lang.String r9) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PRAGMA index_list(`"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = "`)"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            android.database.Cursor r9 = r8.query(r9)
            java.lang.String r0 = "name"
            int r0 = r9.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = "origin"
            int r1 = r9.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = "unique"
            int r2 = r9.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L70
            r3 = 0
            r4 = -1
            if (r0 == r4) goto L6c
            if (r1 == r4) goto L6c
            if (r2 != r4) goto L35
            goto L6c
        L35:
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Throwable -> L70
            r4.<init>()     // Catch: java.lang.Throwable -> L70
        L3a:
            boolean r5 = r9.moveToNext()     // Catch: java.lang.Throwable -> L70
            if (r5 == 0) goto L68
            java.lang.String r5 = r9.getString(r1)     // Catch: java.lang.Throwable -> L70
            java.lang.String r6 = "c"
            boolean r5 = r6.equals(r5)     // Catch: java.lang.Throwable -> L70
            if (r5 != 0) goto L4d
            goto L3a
        L4d:
            java.lang.String r5 = r9.getString(r0)     // Catch: java.lang.Throwable -> L70
            int r6 = r9.getInt(r2)     // Catch: java.lang.Throwable -> L70
            r7 = 1
            if (r6 != r7) goto L59
            goto L5a
        L59:
            r7 = 0
        L5a:
            androidx.room.util.TableInfo$Index r5 = readIndex(r8, r5, r7)     // Catch: java.lang.Throwable -> L70
            if (r5 != 0) goto L64
            r9.close()
            return r3
        L64:
            r4.add(r5)     // Catch: java.lang.Throwable -> L70
            goto L3a
        L68:
            r9.close()
            return r4
        L6c:
            r9.close()
            return r3
        L70:
            r8 = move-exception
            r9.close()
            throw r8
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L59
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L59
        L12:
            androidx.room.util.TableInfo r5 = (androidx.room.util.TableInfo) r5
            java.lang.String r2 = r4.name
            if (r2 == 0) goto L21
            java.lang.String r3 = r5.name
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L26
            goto L25
        L21:
            java.lang.String r2 = r5.name
            if (r2 == 0) goto L26
        L25:
            return r1
        L26:
            java.util.Map<java.lang.String, androidx.room.util.TableInfo$Column> r2 = r4.columns
            if (r2 == 0) goto L33
            java.util.Map<java.lang.String, androidx.room.util.TableInfo$Column> r3 = r5.columns
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L38
            goto L37
        L33:
            java.util.Map<java.lang.String, androidx.room.util.TableInfo$Column> r2 = r5.columns
            if (r2 == 0) goto L38
        L37:
            return r1
        L38:
            java.util.Set<androidx.room.util.TableInfo$ForeignKey> r2 = r4.foreignKeys
            if (r2 == 0) goto L45
            java.util.Set<androidx.room.util.TableInfo$ForeignKey> r3 = r5.foreignKeys
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4a
            goto L49
        L45:
            java.util.Set<androidx.room.util.TableInfo$ForeignKey> r2 = r5.foreignKeys
            if (r2 == 0) goto L4a
        L49:
            return r1
        L4a:
            java.util.Set<androidx.room.util.TableInfo$Index> r1 = r4.indices
            if (r1 == 0) goto L58
            java.util.Set<androidx.room.util.TableInfo$Index> r5 = r5.indices
            if (r5 != 0) goto L53
            goto L58
        L53:
            boolean r5 = r1.equals(r5)
            return r5
        L58:
            return r0
        L59:
            return r1
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.name
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.hashCode()
            goto Lb
        La:
            r0 = 0
        Lb:
            int r0 = r0 * 31
            java.util.Map<java.lang.String, androidx.room.util.TableInfo$Column> r2 = r3.columns
            if (r2 == 0) goto L16
            int r2 = r2.hashCode()
            goto L17
        L16:
            r2 = 0
        L17:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.util.Set<androidx.room.util.TableInfo$ForeignKey> r2 = r3.foreignKeys
            if (r2 == 0) goto L22
            int r1 = r2.hashCode()
        L22:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TableInfo{name='"
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = ", columns="
            r0.append(r1)
            java.util.Map<java.lang.String, androidx.room.util.TableInfo$Column> r1 = r2.columns
            r0.append(r1)
            java.lang.String r1 = ", foreignKeys="
            r0.append(r1)
            java.util.Set<androidx.room.util.TableInfo$ForeignKey> r1 = r2.foreignKeys
            r0.append(r1)
            java.lang.String r1 = ", indices="
            r0.append(r1)
            java.util.Set<androidx.room.util.TableInfo$Index> r1 = r2.indices
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
