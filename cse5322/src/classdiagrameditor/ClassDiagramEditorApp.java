/*
 * Copyright (C) 2014 alex
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package classdiagrameditor;

import java.awt.BorderLayout;
import java.awt.Component;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author alex
 */
public class ClassDiagramEditorApp extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public ClassDiagramEditorApp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        projectPanel2 = new classdiagrameditor.ProjectPanel();
        editorPanel = new classdiagrameditor.EditorPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        menuItemNewProject = new javax.swing.JMenuItem();
        menuItemOpenProject = new javax.swing.JMenuItem();
        menuItemSaveProject = new javax.swing.JMenuItem();
        menuItemCloseProject = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuItemExit = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        menuItemAddClass = new javax.swing.JMenuItem();
        menuItemAddRelationship = new javax.swing.JMenuItem();
        editMenuSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuItemUndo = new javax.swing.JMenuItem();
        menuItemRedo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuItemDeleteProject = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));

        editorPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout editorPanelLayout = new javax.swing.GroupLayout(editorPanel);
        editorPanel.setLayout(editorPanelLayout);
        editorPanelLayout.setHorizontalGroup(
            editorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );
        editorPanelLayout.setVerticalGroup(
            editorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout projectPanel2Layout = new javax.swing.GroupLayout(projectPanel2);
        projectPanel2.setLayout(projectPanel2Layout);
        projectPanel2Layout.setHorizontalGroup(
            projectPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, projectPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        projectPanel2Layout.setVerticalGroup(
            projectPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, projectPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        fileMenu.setText("File");

        menuItemNewProject.setText("New Project...");
        menuItemNewProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNewProjectActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemNewProject);

        menuItemOpenProject.setText("Open Project...");
        menuItemOpenProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemOpenProjectActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemOpenProject);

        menuItemSaveProject.setText("Save Project...");
        menuItemSaveProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSaveProjectActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemSaveProject);

        menuItemCloseProject.setText("Close Project...");
        menuItemCloseProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCloseProjectActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemCloseProject);
        fileMenu.add(jSeparator2);

        menuItemExit.setText("Exit");
        menuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExitActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemExit);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Edit");

        menuItemAddClass.setText("Add Class...");
        menuItemAddClass.setToolTipText("");
        menuItemAddClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAddClassActionPerformed(evt);
            }
        });
        editMenu.add(menuItemAddClass);

        menuItemAddRelationship.setText("Add Relationship...");
        menuItemAddRelationship.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAddRelationshipActionPerformed(evt);
            }
        });
        editMenu.add(menuItemAddRelationship);
        editMenu.add(editMenuSeparator1);

        menuItemUndo.setText("Undo");
        menuItemUndo.setToolTipText("");
        menuItemUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUndoActionPerformed(evt);
            }
        });
        editMenu.add(menuItemUndo);
        menuItemUndo.getAccessibleContext().setAccessibleParent(editorPanel);

        menuItemRedo.setText("Redo");
        menuItemRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRedoActionPerformed(evt);
            }
        });
        editMenu.add(menuItemRedo);
        menuItemRedo.getAccessibleContext().setAccessibleParent(editorPanel);

        editMenu.add(jSeparator1);

        menuItemDeleteProject.setText("Delete Project...");
        menuItemDeleteProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDeleteProjectActionPerformed(evt);
            }
        });
        editMenu.add(menuItemDeleteProject);

        jMenuBar1.add(editMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(projectPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(projectPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemAddClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAddClassActionPerformed
        editorPanel.addClass();
    }//GEN-LAST:event_menuItemAddClassActionPerformed

    private void menuItemAddRelationshipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAddRelationshipActionPerformed
        editorPanel.addRelationship();
    }//GEN-LAST:event_menuItemAddRelationshipActionPerformed

    private void menuItemNewProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNewProjectActionPerformed
        if(projectPanel2.newProject() == true)
        {
            editorPanel.setVisible(true);
            menuItemAddClass.setEnabled(true);
            menuItemAddRelationship.setEnabled(true);
        }
    }//GEN-LAST:event_menuItemNewProjectActionPerformed

    private void menuItemOpenProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemOpenProjectActionPerformed
        if(projectPanel2.openProject() == true)
            editorPanel.setVisible(true); // fake it for now
    }//GEN-LAST:event_menuItemOpenProjectActionPerformed

    private void menuItemSaveProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSaveProjectActionPerformed
        projectPanel2.saveProject();
    }//GEN-LAST:event_menuItemSaveProjectActionPerformed

    private void menuItemCloseProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCloseProjectActionPerformed
        if(projectPanel2.closeProject() == true)
            editorPanel.setVisible(false);  // fake it for now
    }//GEN-LAST:event_menuItemCloseProjectActionPerformed

    private void menuItemDeleteProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDeleteProjectActionPerformed
        if(projectPanel2.deleteProject() == true)
            editorPanel.setVisible(false); // fake it for now
    }//GEN-LAST:event_menuItemDeleteProjectActionPerformed

    private void menuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExitActionPerformed
        // call closeProject first to ensure all data is saved
        projectPanel2.closeProject();
        System.exit(0);
    }//GEN-LAST:event_menuItemExitActionPerformed

    private void menuItemUndoActionPerformed(java.awt.event.ActionEvent evt) {
        editorPanel.undoLastAction();
    }

    private void menuItemRedoActionPerformed(java.awt.event.ActionEvent evt) {
        editorPanel.redoLastAction();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClassDiagramEditorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassDiagramEditorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassDiagramEditorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassDiagramEditorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ClassDiagramEditorApp edApp = new ClassDiagramEditorApp();
                edApp.setVisible(true);
                edApp.run();
                //new ClassDiagramEditorApp().setVisible(true);
            }
        });
    }
    public void run() {
        editorPanel.setVisible(false);
        menuItemAddClass.setEnabled(false);
        menuItemAddRelationship.setEnabled(false);
    }
    
    public void closeProject() {
        // minimal implementation assuming only 1 diagram (editor panel) for now
        // doesn't remove anything.  Just hides.
        editorPanel.setVisible(false);
        menuItemAddClass.setEnabled(false);
        menuItemAddRelationship.setEnabled(false);
        
        // to do: 
        // 1: check each diagram for unsaved elements
        //   a) Prompt to save if any unsaved data found
        // 2: remove all items from each editorPanel
        //   a) remove each editorPanel from ProjectPanel
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu editMenu;
    private javax.swing.JPopupMenu.Separator editMenuSeparator1;
    private classdiagrameditor.EditorPanel editorPanel;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem menuItemAddClass;
    private javax.swing.JMenuItem menuItemAddRelationship;
    private javax.swing.JMenuItem menuItemCloseProject;
    private javax.swing.JMenuItem menuItemDeleteProject;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemNewProject;
    private javax.swing.JMenuItem menuItemOpenProject;
    private javax.swing.JMenuItem menuItemRedo;
    private javax.swing.JMenuItem menuItemSaveProject;
    private javax.swing.JMenuItem menuItemUndo;
    private classdiagrameditor.ProjectPanel projectPanel2;
    // End of variables declaration//GEN-END:variables

}
