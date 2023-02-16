//
//  NoteListViewModel.swift
//  iosApp
//
//  Created by TESFAHUN on 16/02/2023.
//  Copyright © 2023 orgName. All rights reserved.
//

import Foundation
import shared
extension NoteListScreen {
    @MainActor class NoteViewModel: ObservableObject {
        private var noteDataSource :NoteDataSource? = nil
        
        init(noteDataSource : NoteDataSource? = nil){
            self.noteDataSource = noteDataSource
        }
        
        
    }
}
