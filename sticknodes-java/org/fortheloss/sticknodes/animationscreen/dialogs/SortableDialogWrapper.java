package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class SortableDialogWrapper extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private java.lang.String[] _directories;
    private java.lang.String[] _extensions;
    protected com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper.FileMeta> _files;
    protected int _sortMethod;




    class FileMeta implements com.badlogic.gdx.utils.Disposable {
        public java.io.File file;
        public long lastModified;
        public java.lang.String name;
        final /* synthetic */ org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper this$0;

        public FileMeta(org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper r3, java.io.File r4) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                r0 = 0
                r2.lastModified = r0
                java.lang.String r3 = ""
                r2.name = r3
                r2.file = r4
                long r0 = r4.lastModified()
                r2.lastModified = r0
                java.lang.String r3 = r4.getName()
                r2.name = r3
                return
        }

        @Override // com.badlogic.gdx.utils.Disposable
        public void dispose() {
                r1 = this;
                r0 = 0
                r1.file = r0
                r1.name = r0
                return
        }
    }

    public SortableDialogWrapper(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0._sortMethod = r1
            return
    }

    private boolean existsInFiles(com.badlogic.gdx.files.FileHandle r5) {
            r4 = this;
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r0 = r4._files
            r1 = 0
            if (r0 == 0) goto L2a
            int r0 = r0.size
            if (r0 > 0) goto La
            goto L2a
        La:
            java.lang.String r5 = r5.name()
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r0 = r4._files
            int r0 = r0.size
            r2 = 1
            int r0 = r0 - r2
        L14:
            if (r0 < 0) goto L2a
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r3 = r4._files
            java.lang.Object r3 = r3.get(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta r3 = (org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper.FileMeta) r3
            java.lang.String r3 = r3.name
            boolean r3 = r3.equalsIgnoreCase(r5)
            if (r3 == 0) goto L27
            return r2
        L27:
            int r0 = r0 + (-1)
            goto L14
        L2a:
            return r1
    }

    protected void addCurrentSelectionToFiles(org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r6) {
            r5 = this;
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r6 = r6.getSelection()
            int r0 = r6.size()
            if (r0 > 0) goto Lb
            return
        Lb:
            java.util.Iterator r6 = r6.iterator()
        Lf:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String[] r1 = r5._directories
            int r1 = r1.length
            int r1 = r1 + (-1)
        L20:
            if (r1 < 0) goto Lf
            java.lang.String[] r2 = r5._directories
            r2 = r2[r1]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r0)
            java.lang.String r2 = r3.toString()
            com.badlogic.gdx.Files r3 = com.badlogic.gdx.Gdx.files
            com.badlogic.gdx.files.FileHandle r2 = r3.absolute(r2)
            boolean r3 = r2.exists()
            if (r3 == 0) goto L55
            boolean r3 = r5.existsInFiles(r2)
            if (r3 != 0) goto L55
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r3 = r5._files
            org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta
            java.io.File r2 = r2.file()
            r4.<init>(r5, r2)
            r3.add(r4)
        L55:
            int r1 = r1 + (-1)
            goto L20
        L58:
            return
    }

    protected void addToFiles(com.badlogic.gdx.files.FileHandle[] r11, java.lang.String r12, int r13, boolean r14) {
            r10 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r1 = r10._files
            if (r1 != 0) goto L10
            com.badlogic.gdx.utils.Array r1 = new com.badlogic.gdx.utils.Array
            r1.<init>()
            r10._files = r1
        L10:
            r1 = 1
            if (r14 == 0) goto L2d
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r14 = r10._files
            int r14 = r14.size
            int r14 = r14 - r1
        L18:
            if (r14 < 0) goto L28
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r2 = r10._files
            java.lang.Object r2 = r2.get(r14)
            org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta r2 = (org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper.FileMeta) r2
            r2.dispose()
            int r14 = r14 + (-1)
            goto L18
        L28:
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r14 = r10._files
            r14.clear()
        L2d:
            int r14 = r11.length
            r2 = 0
            r3 = 0
        L30:
            if (r3 >= r14) goto Lb7
            r4 = r11[r3]
            java.lang.String r5 = r4.extension()
            java.lang.String[] r6 = r10._extensions
            int r6 = r6.length
            int r6 = r6 - r1
        L3c:
            if (r6 < 0) goto L4d
            java.lang.String[] r7 = r10._extensions
            r7 = r7[r6]
            boolean r7 = r5.equalsIgnoreCase(r7)
            if (r7 == 0) goto L4a
            r5 = 1
            goto L4e
        L4a:
            int r6 = r6 + (-1)
            goto L3c
        L4d:
            r5 = 0
        L4e:
            if (r5 != 0) goto L51
            goto Lb3
        L51:
            if (r13 <= 0) goto L5d
            long r5 = r4.length()
            long r7 = (long) r13
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L5d
            goto Lb3
        L5d:
            java.lang.String r5 = r4.name()
            boolean r5 = r0.add(r5)
            if (r5 != 0) goto L68
            goto Lb3
        L68:
            if (r12 == 0) goto La5
            boolean r5 = r12.isEmpty()
            if (r5 == 0) goto L71
            goto La5
        L71:
            java.lang.String r5 = r4.nameWithoutExtension()
            int r6 = r12.length()
            if (r6 != r1) goto L90
            boolean r5 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(r5, r12)
            if (r5 == 0) goto Lb3
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r5 = r10._files
            org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta
            java.io.File r4 = r4.file()
            r6.<init>(r10, r4)
            r5.add(r6)
            goto Lb3
        L90:
            boolean r5 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(r5, r12)
            if (r5 == 0) goto Lb3
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r5 = r10._files
            org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta
            java.io.File r4 = r4.file()
            r6.<init>(r10, r4)
            r5.add(r6)
            goto Lb3
        La5:
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r5 = r10._files
            org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta
            java.io.File r4 = r4.file()
            r6.<init>(r10, r4)
            r5.add(r6)
        Lb3:
            int r3 = r3 + 1
            goto L30
        Lb7:
            return
    }

    protected void addToFiles(com.badlogic.gdx.files.FileHandle[] r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.addToFiles(r2, r3, r0, r4)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r0 = r2._files
            if (r0 == 0) goto L18
            int r0 = r0.size
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L18
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r1 = r2._files
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta r1 = (org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper.FileMeta) r1
            r1.dispose()
            int r0 = r0 + (-1)
            goto L8
        L18:
            r0 = 0
            r2._files = r0
            r2._extensions = r0
            r2._directories = r0
            super.dispose()
            return
    }

    protected void setDirectories(java.lang.String... r1) {
            r0 = this;
            r0._directories = r1
            return
    }

    protected void setExtensions(java.lang.String... r1) {
            r0 = this;
            r0._extensions = r1
            return
    }

    protected void setListItems(org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r5) {
            r4 = this;
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r0 = r4._files
            if (r0 != 0) goto L5
            return
        L5:
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r1 = 0
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r2 = r4._files
            int r2 = r2.size
        Lf:
            if (r1 >= r2) goto L21
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r3 = r4._files
            java.lang.Object r3 = r3.get(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta r3 = (org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper.FileMeta) r3
            java.lang.String r3 = r3.name
            r0.add(r3)
            int r1 = r1 + 1
            goto Lf
        L21:
            r5.setItems(r0)
            return
    }

    protected void sortFileList() {
            r3 = this;
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r0 = r3._files
            if (r0 == 0) goto L2a
            int r1 = r0.size
            r2 = 1
            if (r1 > r2) goto La
            goto L2a
        La:
            int r1 = r3._sortMethod
            if (r1 != 0) goto L17
            org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$1 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$1
            r1.<init>(r3)
            r0.sort(r1)
            goto L2a
        L17:
            if (r1 != r2) goto L22
            org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$2 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$2
            r1.<init>(r3)
            r0.sort(r1)
            goto L2a
        L22:
            org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$3 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$3
            r1.<init>(r3)
            r0.sort(r1)
        L2a:
            return
    }
}
