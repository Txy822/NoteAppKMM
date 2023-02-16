//
//  HidableSearchTextField.swift
//  iosApp
//
//  Created by TESFAHUN on 16/02/2023.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct HidableSearchTextField <Destination: View>:  View {
    
    var onSearchChange : (String) -> Void
    var destinationprovider :() -> Destination
    var isSearchActive :Bool
    @Binding var searchtext : String
    
    
    var body: some View {
        HStack {
            TextField("Search...")
        }
        
    }
}

struct HidableSearchTextField_Previews: PreviewProvider {
    static var previews: some View {
        HidableSearchTextField()
    }
}
